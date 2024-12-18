package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.MediaSession;
import com.instagram.modal.ModalActivity;
import com.instagram.ui.swipenavigation.PositionConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.OXr, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC55032OXr {
    public static final void A00(Context context, UserSession userSession, MXB mxb, AnonymousClass841 anonymousClass841, InterfaceC189598ae interfaceC189598ae, C40121td c40121td, String str, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, boolean z, boolean z2, boolean z3) {
        MediaUploadMetadata mediaUploadMetadata;
        String str2;
        AbstractC167007dF.A1G(userSession, 1, c40121td);
        ArrayList A1E = AbstractC166987dD.A1E();
        ArrayList A1E2 = AbstractC166987dD.A1E();
        Iterator A0n = MSX.A0n(anonymousClass841);
        while (A0n.hasNext()) {
            MediaSession A0R = MSW.A0R(A0n);
            C47Z A0U = MSY.A0U(A0R, interfaceC189598ae);
            if (A0U != null) {
                A0U.A3Z = A0R.B6E();
                if (A0R.Btq() == C05F.A01) {
                    A0U.A02 = anonymousClass841.AB3();
                }
                A1E.add(A0U);
                String str3 = A0U.A30;
                if (str3 == null) {
                    str3 = "";
                }
                A1E2.add(str3);
            } else {
                AbstractC12120kG.A07(str, "albumMediaItem is null.", null);
                MX1.A01(userSession).A08("onAlbumRenderFinished(): albumMediaItem is null.");
            }
        }
        C47Z A03 = C25A.A00(userSession).A03(((MX5) anonymousClass841).A01.A0C);
        if (A03 != null) {
            MediaUploadMetadata mediaUploadMetadata2 = A03.A13;
            ArrayList A0i = AbstractC167007dF.A0i(A1E);
            Iterator it = A1E.iterator();
            while (it.hasNext()) {
                A0i.add(AbstractC43592JPx.A0l(it).A13);
            }
            mediaUploadMetadata2.A00(C915947r.A00(A0i));
            MediaUploadMetadata mediaUploadMetadata3 = A03.A13;
            ArrayList A0i2 = AbstractC167007dF.A0i(A1E);
            Iterator it2 = A1E.iterator();
            while (it2.hasNext()) {
                C47Z A0l = AbstractC43592JPx.A0l(it2);
                String str4 = A0l.A13.A03;
                if (str4 != null && !AbstractC001900j.A0T(str4)) {
                    mediaUploadMetadata = A0l.A13;
                } else {
                    mediaUploadMetadata = (MediaUploadMetadata) O00.A00.get(A0l.A3L);
                    if (mediaUploadMetadata == null) {
                        str2 = null;
                        A0i2.add(str2);
                    }
                }
                str2 = mediaUploadMetadata.A03;
                A0i2.add(str2);
            }
            mediaUploadMetadata3.A03 = MediaUploadMetadata.A0C.A01(A0i2);
            A03.A0P(System.currentTimeMillis());
            C40121td.A03(A03, c40121td);
            A03.A5U = true;
            A03.A5S = true;
            Iterator it3 = A1E.iterator();
            boolean z4 = false;
            while (it3.hasNext()) {
                C47Z A0l2 = AbstractC43592JPx.A0l(it3);
                A0l2.A3O = A03.A35;
                A0l2.A5U = true;
                A0l2.A5S = true;
                A0l2.A5R = true;
                if (!z4 && A0l2.A0x()) {
                    z4 = true;
                }
            }
            A03.A0j(A1E);
            c40121td.A05.A04();
            AnonymousClass229.A01(c40121td.A01).A22(A03.A2e, false);
            if (z3 || C18U.A06(C06090Tz.A05, userSession, 36321507630458391L)) {
                C9GR.A07(context, 2131961168);
            }
            if (z || z2) {
                anonymousClass841.ELl(interfaceC189598ae);
                List list = AbstractC43847JaB.A00(userSession).A03;
                list.clear();
                list.addAll(A1E2);
            }
            A02(userSession, z3, false);
            interfaceC16820sZ.invoke();
            if (z2) {
                interfaceC16820sZ.invoke();
                return;
            }
            return;
        }
        MX1.A01(userSession).A08("onAlbumRenderFinished(): album does not exist.");
        DialogInterfaceOnClickListenerC55285Og0 dialogInterfaceOnClickListenerC55285Og0 = new DialogInterfaceOnClickListenerC55285Og0(0, userSession, interfaceC16820sZ2, z3);
        if (mxb != null) {
            mxb.A0A(dialogInterfaceOnClickListenerC55285Og0, C05F.A0F);
        }
    }

    public static final void A01(FragmentActivity fragmentActivity, UserSession userSession) {
        InterfaceC53742dD interfaceC53742dD;
        C14360o3.A0B(userSession, 1);
        if (fragmentActivity != null && (fragmentActivity instanceof ModalActivity)) {
            ModalActivity modalActivity = (ModalActivity) fragmentActivity;
            modalActivity.setResult(9685);
            modalActivity.finish();
            return;
        }
        String str = C55772hI.A00(userSession).A05;
        if (str == null) {
            return;
        }
        C1QO valueOf = C1QO.valueOf(str);
        InterfaceC53722dB A00 = AbstractC54852fj.A00();
        if (!(A00 instanceof InterfaceC53742dD) || (interfaceC53742dD = (InterfaceC53742dD) A00) == null) {
            return;
        }
        AbstractC72153Lo.A00 = true;
        interfaceC53742dD.EfJ(valueOf);
        interfaceC53742dD.FBp(new PositionConfig(null, null, null, "return_from_main_camera_to_feed", null, null, null, null, null, null, null, null, null, 0.0f, 0, true));
    }

    public static final void A02(UserSession userSession, boolean z, boolean z2) {
        C43878Jai A00;
        Collection A1J;
        C06090Tz A0U = AbstractC166997dE.A0U(userSession);
        if (C18U.A06(A0U, userSession, 36319463225826764L)) {
            A00 = AbstractC43847JaB.A00(userSession);
            A1J = AbstractC166987dD.A1E();
        } else {
            if (z) {
                return;
            }
            if (!z2 && !C18U.A06(A0U, userSession, 36321507630392854L)) {
                return;
            }
            A00 = AbstractC43847JaB.A00(userSession);
            Object A0L = AbstractC001800i.A0L(A00.A03);
            if (A0L == null) {
                return;
            } else {
                A1J = AbstractC166987dD.A1J(A0L);
            }
        }
        List list = A00.A03;
        list.clear();
        list.addAll(A1J);
    }
}
