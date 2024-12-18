package X;

import android.content.Context;
import com.facebook.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import java.util.List;

/* renamed from: X.5uk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C130395uk {
    public static boolean A00;
    public static final C130395uk A01 = new Object();

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a0, code lost:
    
        if (X.C77153d1.A00.A04(r9, r10) != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00c2, code lost:
    
        if (r2 != null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00c8, code lost:
    
        if (r2.isEmpty() != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00cc, code lost:
    
        if (r1 == com.instagram.api.schemas.RIXUCoverElementMetadataType.A09) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00d0, code lost:
    
        if (r1 == com.instagram.api.schemas.RIXUCoverElementMetadataType.A07) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00d4, code lost:
    
        if (r1 != com.instagram.api.schemas.RIXUCoverElementMetadataType.A08) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00d6, code lost:
    
        A01(r8, r11.A08, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00db, code lost:
    
        if (r4 == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00df, code lost:
    
        if (r1 == com.instagram.api.schemas.RIXUCoverElementMetadataType.A0B) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00e1, code lost:
    
        if (r2 == null) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00e7, code lost:
    
        if (r2.isEmpty() == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00eb, code lost:
    
        if (r1 != com.instagram.api.schemas.RIXUCoverElementMetadataType.A07) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00ed, code lost:
    
        r5 = r11.A09;
        r4 = r6.getResources();
        r1 = java.lang.Integer.valueOf(r10.A0w());
        X.C14360o3.A0A(r4);
        r2 = true;
        r1 = X.C84963qk.A04(r4, r1, 10000, false, false);
        r0 = X.AbstractC74053Tw.A00(r4, r10.A0w());
        r5.setText(r1);
        r5.setContentDescription(r0);
        r5.setVisibility(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00b3, code lost:
    
        if (r1 != com.instagram.api.schemas.RIXUCoverElementMetadataType.A0B) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00b7, code lost:
    
        if (r1 == com.instagram.api.schemas.RIXUCoverElementMetadataType.A07) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x011e, code lost:
    
        if (r2.isEmpty() != false) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(android.content.Context r6, X.C51756Mtf r7, X.InterfaceC11380iw r8, com.instagram.common.session.UserSession r9, X.C38321qM r10, X.C101544hP r11) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C130395uk.A00(android.content.Context, X.Mtf, X.0iw, com.instagram.common.session.UserSession, X.1qM, X.4hP):void");
    }

    public static final void A01(InterfaceC11380iw interfaceC11380iw, IgSimpleImageView igSimpleImageView, List list) {
        Context context = igSimpleImageView.getContext();
        C14360o3.A07(context);
        igSimpleImageView.setImageDrawable(AbstractC89513yr.A01(context, Float.valueOf(0.3f), 3, interfaceC11380iw.getModuleName(), list, context.getResources().getDimensionPixelSize(R.dimen.abc_select_dialog_padding_start_material), true, false, true));
        igSimpleImageView.setVisibility(0);
        A00 = true;
    }
}
