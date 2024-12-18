package com.instagram.shopping.fragment.cart;

/* loaded from: classes7.dex */
public final class ShoppingCartFragmentLifecycleUtil {
    public static void cleanupReferences(ShoppingCartFragment shoppingCartFragment) {
        shoppingCartFragment.mRecyclerView = null;
        shoppingCartFragment.mProductCollectionStub = null;
    }
}
