package com.facebook.rendercore;

import X.AbstractC09440dt;
import X.C14360o3;
import X.C2WC;
import X.C79023g9;
import X.C79243gV;
import X.EnumC09460dv;
import X.InterfaceC09390do;
import android.graphics.Rect;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class RenderTreeNode {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Rect A03;
    public final Rect A04;
    public final RenderTreeNode A05;
    public final C2WC A06;
    public final Object A07;
    public final InterfaceC09390do A08;

    public final String A00(C79243gV c79243gV) {
        int i;
        long j;
        C2WC c2wc = this.A06;
        long A0H = c2wc.A0H();
        String A04 = c2wc.A04();
        if (c79243gV != null) {
            i = ((Number) c79243gV.A02.A06(A0H, -1)).intValue();
        } else {
            i = -1;
        }
        String shortString = this.A03.toShortString();
        C14360o3.A07(shortString);
        int size = ((List) this.A08.getValue()).size();
        RenderTreeNode renderTreeNode = this.A05;
        if (renderTreeNode != null) {
            j = renderTreeNode.A06.A0H();
        } else {
            j = -1;
        }
        String format = String.format(Locale.US, "Id=%d; renderUnit='%s'; indexInTree=%d; posInParent=%d; bounds=%s; absPosition=[%d, %d]; childCount=%d; parentId=%d;", Arrays.copyOf(new Object[]{Long.valueOf(A0H), A04, Integer.valueOf(i), Integer.valueOf(this.A02), shortString, Integer.valueOf(this.A00), Integer.valueOf(this.A01), Integer.valueOf(size), Long.valueOf(j)}, 9));
        C14360o3.A07(format);
        return format;
    }

    public final void A01(Rect rect) {
        int i = this.A00;
        rect.left = i;
        int i2 = this.A01;
        rect.top = i2;
        Rect rect2 = this.A03;
        rect.right = i + rect2.width();
        rect.bottom = i2 + rect2.height();
    }

    public RenderTreeNode(Rect rect, Rect rect2, RenderTreeNode renderTreeNode, C2WC c2wc, Object obj, int i) {
        int i2;
        this.A05 = renderTreeNode;
        this.A06 = c2wc;
        this.A07 = obj;
        this.A03 = rect;
        this.A04 = rect2;
        this.A02 = i;
        if (renderTreeNode != null) {
            i2 = renderTreeNode.A00;
        } else {
            i2 = 0;
        }
        this.A00 = i2 + rect.left;
        this.A01 = (renderTreeNode != null ? renderTreeNode.A01 : 0) + rect.top;
        this.A08 = AbstractC09440dt.A00(EnumC09460dv.A02, C79023g9.A00);
    }
}
