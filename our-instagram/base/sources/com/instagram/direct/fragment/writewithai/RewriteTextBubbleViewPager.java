package com.instagram.direct.fragment.writewithai;

import X.AbstractC167007dF;
import X.C0fA;
import X.C14360o3;
import X.C37058GUs;
import X.C44691Jqa;
import X.C45095JxP;
import X.C48549Ldm;
import X.C50204MFl;
import X.EnumC74213Va;
import X.InterfaceC16820sZ;
import X.JQ0;
import X.KL3;
import X.LEU;
import X.MNG;
import X.RunnableC49952M3t;
import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.widget.Adapter;
import com.facebook.R;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes8.dex */
public final class RewriteTextBubbleViewPager extends ReboundViewPager {
    public int A00;
    public MNG A01;
    public InterfaceC16820sZ A02;
    public final KL3 A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewriteTextBubbleViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C14360o3.A0B(context, 1);
        KL3 kl3 = new KL3(new C37058GUs(this, 13));
        this.A03 = kl3;
        this.A02 = C50204MFl.A00;
        setAdapter((Adapter) kl3);
        A0P(new C48549Ldm(this, 3));
        Context context2 = getContext();
        this.A0C = AbstractC167007dF.A0K(context2).widthPixels - context2.getResources().getDimensionPixelSize(R.dimen.add_to_story_dual_destination_share_sheet_story_row_height);
    }

    public final void A0T(Integer num, String str, String str2, String str3, String str4) {
        int count;
        C14360o3.A0B(str, 0);
        if (this.A0N == EnumC74213Va.A02) {
            setScrollMode(EnumC74213Va.A03);
        }
        KL3 kl3 = this.A03;
        kl3.A03.add(new C45095JxP(str, str2, str3, str4));
        C0fA.A00(kl3, -80578615);
        if (num == null || (count = num.intValue()) >= kl3.getCount()) {
            count = kl3.getCount() - 1;
        }
        this.A00 = count;
        Handler handler = getHandler();
        if (handler != null) {
            handler.post(new RunnableC49952M3t(this, count));
        }
        if (count >= 1) {
            kl3.A00(count, count - 1);
        }
    }

    public final void setApplyReWrite(InterfaceC16820sZ interfaceC16820sZ) {
        C14360o3.A0B(interfaceC16820sZ, 0);
        this.A02 = interfaceC16820sZ;
    }

    public final void setBotResponseFeedbackController(LEU leu) {
        C14360o3.A0B(leu, 0);
        this.A03.A02 = leu;
    }

    public final String getAppliedPromptOfCurrentPage() {
        KL3 kl3 = this.A03;
        return ((C45095JxP) kl3.A03.get(this.A00)).A02;
    }

    public final InterfaceC16820sZ getApplyReWrite() {
        return this.A02;
    }

    public final MNG getCustomFieldChangeListener() {
        return this.A01;
    }

    public final String getTextToRewriteFromCurrentPage() {
        KL3 kl3 = this.A03;
        return ((C45095JxP) kl3.A03.get(this.A00)).A05;
    }

    public final String getTextToRewriteFromOriginalPage() {
        KL3 kl3 = this.A03;
        return ((C45095JxP) kl3.A03.get(this.A00)).A04;
    }

    public final void setCustomFieldChangeListener(MNG mng) {
        this.A01 = mng;
    }

    public final void setTextBubbleMaxHeight(int i) {
        KL3 kl3 = this.A03;
        kl3.A00 = i;
        C44691Jqa c44691Jqa = kl3.A01;
        if (c44691Jqa != null) {
            c44691Jqa.A00.setMaxHeight(i);
        }
        C0fA.A00(kl3, 1643333874);
    }

    public /* synthetic */ RewriteTextBubbleViewPager(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JQ0.A0C(attributeSet, i));
    }
}
