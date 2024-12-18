package com.facebook.rtc.views.omnigrid;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC25226BEj;
import X.AbstractC25235BEs;
import X.AbstractC54334Nzs;
import X.AbstractC58317Pt9;
import X.C0T6;
import X.C14360o3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes9.dex */
public final class GridLayoutInputItem extends C0T6 {
    public final Object extras;
    public final long id;
    public final boolean isSelf;
    public final boolean isVideoOff;
    public final GridItemType itemType;
    public final int priority;
    public final GridItemSize videoSize;

    public static /* synthetic */ GridLayoutInputItem copy$default(GridLayoutInputItem gridLayoutInputItem, long j, GridItemType gridItemType, GridItemSize gridItemSize, boolean z, int i, Object obj, int i2, Object obj2) {
        Object obj3 = obj;
        int i3 = i;
        boolean z2 = z;
        GridItemSize gridItemSize2 = gridItemSize;
        GridItemType gridItemType2 = gridItemType;
        long j2 = j;
        if ((i2 & 1) != 0) {
            j2 = gridLayoutInputItem.id;
        }
        if ((i2 & 2) != 0) {
            gridItemType2 = gridLayoutInputItem.itemType;
        }
        if ((i2 & 4) != 0) {
            gridItemSize2 = gridLayoutInputItem.videoSize;
        }
        if ((i2 & 8) != 0) {
            z2 = gridLayoutInputItem.isVideoOff;
        }
        if ((i2 & 16) != 0) {
            i3 = gridLayoutInputItem.priority;
        }
        if ((i2 & 32) != 0) {
            obj3 = gridLayoutInputItem.extras;
        }
        AbstractC167017dG.A1P(gridItemType2, gridItemSize2);
        return new GridLayoutInputItem(j2, gridItemType2, gridItemSize2, z2, i3, obj3);
    }

    public final long component1() {
        return this.id;
    }

    public final GridItemType component2() {
        return this.itemType;
    }

    public final GridItemSize component3() {
        return this.videoSize;
    }

    public final boolean component4() {
        return this.isVideoOff;
    }

    public final int component5() {
        return this.priority;
    }

    public final Object component6() {
        return this.extras;
    }

    public final GridLayoutInputItem copy(long j, GridItemType gridItemType, GridItemSize gridItemSize, boolean z, int i, Object obj) {
        AbstractC167017dG.A1P(gridItemType, gridItemSize);
        return new GridLayoutInputItem(j, gridItemType, gridItemSize, z, i, obj);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GridLayoutInputItem) {
                GridLayoutInputItem gridLayoutInputItem = (GridLayoutInputItem) obj;
                if (this.id != gridLayoutInputItem.id || this.itemType != gridLayoutInputItem.itemType || !C14360o3.A0K(this.videoSize, gridLayoutInputItem.videoSize) || this.isVideoOff != gridLayoutInputItem.isVideoOff || this.priority != gridLayoutInputItem.priority || !C14360o3.A0K(this.extras, gridLayoutInputItem.extras)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ GridLayoutInputItem(long j, GridItemType gridItemType, GridItemSize gridItemSize, boolean z, int i, Object obj, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, gridItemType, (i2 & 4) != 0 ? AbstractC54334Nzs.A00 : gridItemSize, AbstractC25226BEj.A1U(i2 & 8, z), (i2 & 16) != 0 ? 0 : i, (i2 & 32) != 0 ? null : obj);
    }

    public final Object getExtras() {
        return this.extras;
    }

    public final long getId() {
        return this.id;
    }

    public final GridItemType getItemType() {
        return this.itemType;
    }

    public final int getPriority() {
        return this.priority;
    }

    public final GridItemSize getVideoSize() {
        return this.videoSize;
    }

    public int hashCode() {
        return ((AbstractC167007dF.A0D(this.isVideoOff, AbstractC166997dE.A0J(this.videoSize, AbstractC166997dE.A0J(this.itemType, AbstractC25235BEs.A03(this.id)))) + this.priority) * 31) + AbstractC167017dG.A0M(this.extras);
    }

    public final boolean isSelf() {
        return this.isSelf;
    }

    public final boolean isVideoOff() {
        return this.isVideoOff;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("GridLayoutInputItem(id=");
        A1C.append(this.id);
        A1C.append(", itemType=");
        A1C.append(this.itemType);
        A1C.append(AbstractC58317Pt9.A00(439));
        A1C.append(this.videoSize);
        A1C.append(", isVideoOff=");
        A1C.append(this.isVideoOff);
        A1C.append(", priority=");
        A1C.append(this.priority);
        A1C.append(", extras=");
        return AbstractC167017dG.A0o(this.extras, A1C);
    }

    public GridLayoutInputItem(long j, GridItemType gridItemType, GridItemSize gridItemSize, boolean z, int i, Object obj) {
        AbstractC167017dG.A1R(gridItemType, gridItemSize);
        this.id = j;
        this.itemType = gridItemType;
        this.videoSize = gridItemSize;
        this.isVideoOff = z;
        this.priority = i;
        this.extras = obj;
        this.isSelf = AbstractC167007dF.A1X(gridItemType, GridItemType.SELF_VIEW);
    }
}
