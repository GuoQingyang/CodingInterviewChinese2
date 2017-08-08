/**
 * //==================================================================
 * // 《剑指Offer——名企面试官精讲典型编程题》代码
 * // 作者：何海涛
 * //==================================================================
 * <p>
 * // 面试题27：二叉树的镜像
 * // 题目：请完成一个函数，输入一个二叉树，该函数输出它的镜像。
 */
package com.jchanghong.code;

import com.jchanghong.code.util.TreeNode;
import com.jchanghong.code.util.TreeUtil;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class Java27_MirrorOfBinaryTree {
    public TreeNode mirror(TreeNode head) {
        return null;
    }

    @Test
    public void test() throws Exception {
        TreeNode head = TreeUtil.construct(Arrays.asList(1, 2, 3));
        TreeNode h1 = TreeUtil.construct(Arrays.asList(1, 3, 2));
        Assert.assertTrue(TreeUtil.valuesEqual(head, mirror(h1)));

    }
}
