package com.google.common.collect;

/* loaded from: classes10.dex */
public class EmptyImmutableSetMultimap extends ImmutableSetMultimap {
    public static final EmptyImmutableSetMultimap A00 = new EmptyImmutableSetMultimap();
    public static final long serialVersionUID = 0;

    public EmptyImmutableSetMultimap() {
        super(RegularImmutableMap.A02, 0);
    }

    private Object readResolve() {
        return A00;
    }
}
