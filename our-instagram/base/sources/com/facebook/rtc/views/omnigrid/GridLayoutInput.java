package com.facebook.rtc.views.omnigrid;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC25236BEt;
import X.C0T6;
import X.C14360o3;
import X.MSX;
import java.util.List;

/* loaded from: classes9.dex */
public final class GridLayoutInput extends C0T6 {
    public final GridLayoutConfigForLayoutInput config;
    public final int height;
    public final List items;
    public final int width;

    public final List component1() {
        return this.items;
    }

    public final GridLayoutConfigForLayoutInput component2() {
        return this.config;
    }

    public final int component3() {
        return this.width;
    }

    public final int component4() {
        return this.height;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GridLayoutInput) {
                GridLayoutInput gridLayoutInput = (GridLayoutInput) obj;
                if (!C14360o3.A0K(this.items, gridLayoutInput.items) || !C14360o3.A0K(this.config, gridLayoutInput.config) || this.width != gridLayoutInput.width || this.height != gridLayoutInput.height) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ GridLayoutInput copy$default(GridLayoutInput gridLayoutInput, List list, GridLayoutConfigForLayoutInput gridLayoutConfigForLayoutInput, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            list = gridLayoutInput.items;
        }
        if ((i3 & 2) != 0) {
            gridLayoutConfigForLayoutInput = gridLayoutInput.config;
        }
        if ((i3 & 4) != 0) {
            i = gridLayoutInput.width;
        }
        if ((i3 & 8) != 0) {
            i2 = gridLayoutInput.height;
        }
        AbstractC167017dG.A1N(list, gridLayoutConfigForLayoutInput);
        return new GridLayoutInput(list, gridLayoutConfigForLayoutInput, i, i2);
    }

    public final GridLayoutConfigForLayoutInput getConfig() {
        return this.config;
    }

    public final int getHeight() {
        return this.height;
    }

    public final List getItems() {
        return this.items;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return ((AbstractC166997dE.A0J(this.config, AbstractC166987dD.A0G(this.items)) + this.width) * 31) + this.height;
    }

    public GridLayoutInput(List list, GridLayoutConfigForLayoutInput gridLayoutConfigForLayoutInput, int i, int i2) {
        AbstractC167017dG.A1P(list, gridLayoutConfigForLayoutInput);
        this.items = list;
        this.config = gridLayoutConfigForLayoutInput;
        this.width = i;
        this.height = i2;
    }

    public final GridLayoutInput copy(List list, GridLayoutConfigForLayoutInput gridLayoutConfigForLayoutInput, int i, int i2) {
        AbstractC167017dG.A1N(list, gridLayoutConfigForLayoutInput);
        return new GridLayoutInput(list, gridLayoutConfigForLayoutInput, i, i2);
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("GridLayoutInput(items=");
        A1C.append(this.items);
        A1C.append(", config=");
        A1C.append(this.config);
        A1C.append(", width=");
        MSX.A1O(A1C, this.width);
        return AbstractC25236BEt.A0Z(A1C, this.height);
    }
}
