package com.google.common.collect;

import X.AbstractC24841Jd;
import X.AbstractC62759SPq;
import java.io.Serializable;

/* loaded from: classes10.dex */
public class Multisets$ImmutableEntry extends AbstractC62759SPq implements Serializable {
    public static final long serialVersionUID = 0;
    public final int count;
    public final Object element;

    public Multisets$ImmutableEntry(Object element, int count) {
        this.element = element;
        this.count = count;
        AbstractC24841Jd.A00(count, "count");
    }
}
