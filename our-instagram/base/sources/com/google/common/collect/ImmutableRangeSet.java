package com.google.common.collect;

import X.SPS;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes10.dex */
public final class ImmutableRangeSet extends SPS implements Serializable {
    public final transient ImmutableList A00;
    public static final ImmutableRangeSet A02 = new ImmutableRangeSet(ImmutableList.of());
    public static final ImmutableRangeSet A01 = new ImmutableRangeSet(ImmutableList.of((Object) Range.A00));

    /* loaded from: classes10.dex */
    public final class SerializedForm implements Serializable {
        public final ImmutableList ranges;

        public Object readResolve() {
            if (this.ranges.isEmpty()) {
                return ImmutableRangeSet.A02;
            }
            if (this.ranges.equals(ImmutableList.of((Object) Range.A00))) {
                return ImmutableRangeSet.A01;
            }
            return new ImmutableRangeSet(this.ranges);
        }

        public SerializedForm(ImmutableList ranges) {
            this.ranges = ranges;
        }
    }

    private void readObject(ObjectInputStream stream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public Object writeReplace() {
        return new SerializedForm(this.A00);
    }

    public ImmutableRangeSet(ImmutableList ranges) {
        this.A00 = ranges;
    }
}
