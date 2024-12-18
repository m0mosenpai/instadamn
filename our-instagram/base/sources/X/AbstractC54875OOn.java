package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.creation.activity.MediaCaptureActivity;
import com.instagram.creation.base.CreationSession;
import com.instagram.creation.base.PhotoSession;
import com.instagram.model.creation.MediaCaptureConfig;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.OOn, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54875OOn {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void A00(Context context, UserSession userSession, AnonymousClass840 anonymousClass840, InterfaceC58286Pse interfaceC58286Pse, boolean z) {
        EnumC53116NeT[] enumC53116NeTArr;
        InterfaceC58030PoG c56213OxM;
        C14360o3.A0B(anonymousClass840, 0);
        AbstractC25233BEq.A0w(1, interfaceC58286Pse, context, userSession);
        FA7.A00(userSession).A00(EnumC33422Ept.A07, C05F.A1F);
        AnonymousClass841 A00 = anonymousClass840.A00();
        if (z && A00.CPp()) {
            C6WI.A01().A07(userSession, "edit_carousel", false);
            AbstractC43593JPy.A1P(userSession);
            return;
        }
        C6WI.A01().A07(userSession, "share_screen", false);
        CreationSession creationSession = ((MX5) A00).A01;
        MediaCaptureConfig mediaCaptureConfig = creationSession.A09;
        if (mediaCaptureConfig != null && mediaCaptureConfig.A0C) {
            enumC53116NeTArr = new EnumC53116NeT[]{EnumC53116NeT.A03, EnumC53116NeT.A02};
        } else {
            enumC53116NeTArr = new EnumC53116NeT[]{EnumC53116NeT.A03};
        }
        List A05 = creationSession.A05();
        C14360o3.A07(A05);
        AtomicInteger A1C = MSW.A1C(A05.size());
        List<PhotoSession> A052 = creationSession.A05();
        C14360o3.A07(A052);
        for (PhotoSession photoSession : A052) {
            if (creationSession.A02() == null && C18U.A06(C06090Tz.A05, userSession, 36315662181928423L)) {
                String str = photoSession.A0B;
                EnumC69983Ch enumC69983Ch = creationSession.A0A;
                enumC69983Ch.getClass();
                c56213OxM = new C56214OxN(context, userSession, photoSession, enumC69983Ch, str, A00.E3z(), A1C, z);
            } else {
                c56213OxM = new C56213OxM(context, userSession, A00, A1C, z);
            }
            AnonymousClass841 A002 = anonymousClass840.A00();
            MediaCaptureActivity mediaCaptureActivity = (MediaCaptureActivity) interfaceC58286Pse;
            MXB mxb = mediaCaptureActivity.A07;
            if (mxb != null) {
                InterfaceC189678am interfaceC189678am = (InterfaceC189678am) context;
                P07 p07 = new P07(context, userSession, c56213OxM, photoSession, mxb, A002, interfaceC189678am, creationSession.A09, (InterfaceC189598ae) context, null, creationSession.A02);
                StringBuilder A1C2 = AbstractC166987dD.A1C();
                A1C2.append("saveAndFinish(): requesting final render now. pendingMediaKey= ");
                A1C2.append(photoSession.A0A);
                A1C2.append(" filePath= ");
                A1C2.append(A00);
                C0K8.A0C("MediaSaveHelper", AbstractC166997dE.A0x(".photoFilePath()", A1C2));
                synchronized (C50713MaC.A00(userSession)) {
                }
                if (interfaceC58286Pse.Bmb(A00.E4J()).Co2(p07, photoSession.A07, (EnumC53116NeT[]) Arrays.copyOf(enumC53116NeTArr, enumC53116NeTArr.length), true)) {
                    C0K8.A0C("MediaSaveHelper", "saveAndFinish(): request render was successful. Show the dialog while we wait for the request to finish.");
                    MXB mxb2 = mediaCaptureActivity.A07;
                    if (mxb2 != null) {
                        mxb2.A0A(null, C05F.A01);
                    } else {
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                }
            } else {
                throw AbstractC166987dD.A14("Required value was null.");
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean A01(Context context, UserSession userSession, PhotoSession photoSession, AnonymousClass841 anonymousClass841, InterfaceC58286Pse interfaceC58286Pse, CountDownLatch countDownLatch, boolean z) {
        AbstractC167027dH.A0a(1, interfaceC58286Pse, photoSession, context, userSession);
        EnumC53116NeT[] enumC53116NeTArr = {EnumC53116NeT.A02};
        C56215OxO c56215OxO = C56215OxO.A00;
        MediaCaptureActivity mediaCaptureActivity = (MediaCaptureActivity) interfaceC58286Pse;
        MXB mxb = mediaCaptureActivity.A07;
        if (mxb != null) {
            CreationSession creationSession = ((MX5) anonymousClass841).A01;
            InterfaceC189678am interfaceC189678am = (InterfaceC189678am) context;
            boolean Co2 = interfaceC58286Pse.Bmb(photoSession.A0B).Co2(new P07(context, userSession, c56215OxO, photoSession, mxb, anonymousClass841, interfaceC189678am, creationSession.A09, (InterfaceC189598ae) context, countDownLatch, creationSession.A02), photoSession.A07, (EnumC53116NeT[]) Arrays.copyOf(enumC53116NeTArr, 1), true);
            if (Co2 && z) {
                C0K8.A0C("MediaSaveHelper", "saveToGallery(): request render was successful. Show the dialog while we wait for the request to finish.");
                MXB mxb2 = mediaCaptureActivity.A07;
                if (mxb2 != null) {
                    mxb2.A0A(null, C05F.A01);
                } else {
                    throw AbstractC166987dD.A14("Required value was null.");
                }
            }
            return Co2;
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }
}
