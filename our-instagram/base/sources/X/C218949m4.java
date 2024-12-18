package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.creation.capture.quickcapture.superlativesticker.model.SuperlativeStickerClientModel;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.9m4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C218949m4 extends C8FA {
    public static final ALu A0C = new Object();
    public int A00;
    public int A01;
    public Drawable A02;
    public C8FC A03;
    public boolean A04;
    public final Context A05;
    public final UserSession A06;
    public final TargetViewSizeProvider A07;
    public final SuperlativeStickerClientModel A08;
    public final List A09;
    public final List A0A;
    public final Map A0B;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C218949m4(android.content.Context r40, com.instagram.common.session.UserSession r41, X.C183688Ct r42, com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r43, com.instagram.creation.capture.quickcapture.superlativesticker.model.SuperlativeStickerClientModel r44) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C218949m4.<init>(android.content.Context, com.instagram.common.session.UserSession, X.8Ct, com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider, com.instagram.creation.capture.quickcapture.superlativesticker.model.SuperlativeStickerClientModel):void");
    }

    public static final void A01(C218949m4 c218949m4, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C09530e4 c09530e4 = (C09530e4) it.next();
            Drawable drawable = (Drawable) c09530e4.A00;
            C8FC c8fc = (C8FC) c09530e4.A01;
            ((C8FA) c218949m4).A02.A0h(drawable, c218949m4.A02(), c8fc, null, C148276lx.A1W.A01());
        }
    }
}
