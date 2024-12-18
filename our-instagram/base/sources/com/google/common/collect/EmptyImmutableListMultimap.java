package com.google.common.collect;

/* loaded from: classes10.dex */
public class EmptyImmutableListMultimap extends ImmutableListMultimap {
    public static final EmptyImmutableListMultimap A00 = new EmptyImmutableListMultimap();
    public static final long serialVersionUID = 0;

    public EmptyImmutableListMultimap() {
        super(RegularImmutableMap.A02, 0);
    }

    private Object readResolve() {
        return A00;
    }
}
