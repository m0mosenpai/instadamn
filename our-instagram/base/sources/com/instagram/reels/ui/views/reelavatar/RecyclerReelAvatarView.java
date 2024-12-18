package com.instagram.reels.ui.views.reelavatar;

import X.AbstractC09440dt;
import X.C0f9;
import X.C14360o3;
import X.C17280tP;
import X.C3OV;
import X.C72933Ot;
import X.C9F7;
import X.InterfaceC09390do;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.R;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class RecyclerReelAvatarView extends FrameLayout {
    public static final Map A04;
    public static final boolean A05;
    public C3OV A00;
    public final int A01;
    public final AttributeSet A02;
    public final InterfaceC09390do A03;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RecyclerReelAvatarView(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }

    static {
        C17280tP A00 = C17280tP.A4E.A00();
        A05 = ((Boolean) A00.A2S.CES(A00, C17280tP.A4G[9])).booleanValue();
        A04 = new HashMap();
    }

    private final C3OV getOrCreateAvatarView() {
        Object obj;
        C3OV c3ov = this.A00;
        if (c3ov == null) {
            Context context = getContext();
            C14360o3.A07(context);
            c3ov = new C3OV(context);
            c3ov.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        }
        if (c3ov != this.A00) {
            removeView(c3ov);
            this.A00 = c3ov;
            addView(c3ov);
        }
        if (A05) {
            removeView(getReelIdTextView());
            addView(getReelIdTextView());
            TextView reelIdTextView = getReelIdTextView();
            StringBuilder sb = new StringBuilder();
            sb.append(' ');
            C3OV c3ov2 = this.A00;
            if (c3ov2 != null) {
                obj = c3ov2.getTag(R.id.recycler_reel_id);
            } else {
                obj = null;
            }
            sb.append(obj);
            sb.append(' ');
            reelIdTextView.setText(sb.toString());
        }
        return c3ov;
    }

    private final TextView getReelIdTextView() {
        return (TextView) this.A03.getValue();
    }

    public final C72933Ot getHolder() {
        return getOrCreateAvatarView().A00;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        int A06 = C0f9.A06(-76545878);
        super.onAttachedToWindow();
        getOrCreateAvatarView();
        C0f9.A0D(800285, A06);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        int A06 = C0f9.A06(1488764684);
        super.onDetachedFromWindow();
        C0f9.A0D(-512776928, A06);
    }

    /* JADX WARN: Code restructure failed: missing block: B:529:0x0342, code lost:
    
        if (r7 != null) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0137, code lost:
    
        if (r3.A0l() == false) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0cd4  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0d03  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0d13  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0d1c  */
    /* JADX WARN: Removed duplicated region for block: B:231:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:492:0x0c27  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x019d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00(X.InterfaceC11380iw r43, final com.instagram.common.session.UserSession r44, final X.C3G4 r45, X.C3G4 r46, final X.InterfaceC64002vL r47, int r48, boolean r49, boolean r50, boolean r51, boolean r52) {
        /*
            Method dump skipped, instructions count: 3595
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.reels.ui.views.reelavatar.RecyclerReelAvatarView.A00(X.0iw, com.instagram.common.session.UserSession, X.3G4, X.3G4, X.2vL, int, boolean, boolean, boolean, boolean):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecyclerReelAvatarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        this.A02 = attributeSet;
        this.A01 = i;
        this.A03 = AbstractC09440dt.A01(new C9F7(19, context, this));
        this.A00 = getOrCreateAvatarView();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RecyclerReelAvatarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }

    public /* synthetic */ RecyclerReelAvatarView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
