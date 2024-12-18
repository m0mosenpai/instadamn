package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxHealthReport;
import com.facebook.msys.mca.MailboxObservableImpl;
import com.facebook.msys.mcf.MsysError;
import com.facebook.msys.mci.CQLResultSet;
import com.facebook.msys.util.NotificationScope;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.util.List;
import java.util.Map;

/* renamed from: X.JVk, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43725JVk implements InterfaceC124965l1 {
    public final int A00;
    public final Object A01;
    public final String A02;

    public C43725JVk(String str, Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }

    public static NotificationScope A00(C124935ky c124935ky, Object obj, String str, int i) {
        return c124935ky.A00(new C43725JVk(str, obj, i), str);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [X.69s, X.K3o] */
    /* JADX WARN: Type inference failed for: r11v0, types: [X.69s, X.K3q] */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v2, types: [X.69s] */
    /* JADX WARN: Type inference failed for: r6v2, types: [X.K3h, X.69s] */
    /* JADX WARN: Type inference failed for: r9v0, types: [X.69s, X.K3n] */
    @Override // X.InterfaceC124965l1
    public final void Dh3(Map map) {
        Object nonNullNotificationValue;
        MailboxObservableImpl mailboxObservableImpl;
        Object obj;
        AbstractC1345065z abstractC1345065z;
        String str;
        int i;
        AbstractC1345065z abstractC1345065z2;
        String str2;
        int i2;
        MailboxObservableImpl mailboxObservableImpl2;
        Object obj2;
        K4D k4d;
        C45309K3m c45309K3m;
        switch (this.A00) {
            case 0:
                map.getClass();
                nonNullNotificationValue = MailboxFeature.getNonNullNotificationValue(C129575tM.A00, map, this.A02, 5);
                mailboxObservableImpl = ((LU3) this.A01).A01;
                mailboxObservableImpl.setResult(nonNullNotificationValue);
                return;
            case 1:
                map.getClass();
                AbstractC1345065z abstractC1345065z3 = C1344865x.A00;
                MailboxFeature.getNonNullNotificationValue(abstractC1345065z3, map, this.A02, 17);
                map.get(abstractC1345065z3.A00(16));
                mailboxObservableImpl2 = ((LUC) this.A01).A01;
                obj2 = new Object();
                mailboxObservableImpl2.setResult(obj2);
                return;
            case 2:
                map.getClass();
                AbstractC1345065z abstractC1345065z4 = C1344865x.A00;
                boolean booleanValue = ((Boolean) MailboxFeature.getNonNullNotificationValue(abstractC1345065z4, map, this.A02, 11)).booleanValue();
                map.get(abstractC1345065z4.A00(10));
                mailboxObservableImpl2 = ((C44186Jfp) this.A01).A01;
                obj2 = new C44187Jfq(booleanValue);
                mailboxObservableImpl2.setResult(obj2);
                return;
            case 3:
                map.getClass();
                AbstractC1345065z abstractC1345065z5 = C1344865x.A00;
                boolean booleanValue2 = ((Boolean) MailboxFeature.getNonNullNotificationValue(abstractC1345065z5, map, this.A02, 9)).booleanValue();
                map.get(abstractC1345065z5.A00(8));
                mailboxObservableImpl2 = ((LUD) this.A01).A01;
                obj2 = new C47221Ktu(booleanValue2);
                mailboxObservableImpl2.setResult(obj2);
                return;
            case 4:
                map.getClass();
                nonNullNotificationValue = MailboxFeature.getNonNullNotificationValue(K3W.A00, map, this.A02, C8S8.DEFAULT_SWIPE_ANIMATION_DURATION);
                obj = ((JVY) this.A01).A03;
                mailboxObservableImpl = (MailboxObservableImpl) obj;
                mailboxObservableImpl.setResult(nonNullNotificationValue);
                return;
            case 5:
                map.getClass();
                nonNullNotificationValue = MailboxFeature.getNonNullNotificationValue(K3W.A00, map, this.A02, 360);
                obj = ((JVY) this.A01).A02;
                mailboxObservableImpl = (MailboxObservableImpl) obj;
                mailboxObservableImpl.setResult(nonNullNotificationValue);
                return;
            case 6:
                map.getClass();
                nonNullNotificationValue = MailboxFeature.getNonNullNotificationValue(K3W.A00, map, this.A02, 317);
                obj = ((C48191LUp) this.A01).A02;
                mailboxObservableImpl = (MailboxObservableImpl) obj;
                mailboxObservableImpl.setResult(nonNullNotificationValue);
                return;
            case 7:
                map.getClass();
                abstractC1345065z = K3W.A00;
                str = this.A02;
                i = 321;
                nonNullNotificationValue = MailboxFeature.getNonNullNotificationValue(abstractC1345065z, map, str, i);
                obj = ((C44176Jff) this.A01).A02;
                mailboxObservableImpl = (MailboxObservableImpl) obj;
                mailboxObservableImpl.setResult(nonNullNotificationValue);
                return;
            case 8:
                map.getClass();
                abstractC1345065z = K3W.A00;
                str = this.A02;
                i = 385;
                nonNullNotificationValue = MailboxFeature.getNonNullNotificationValue(abstractC1345065z, map, str, i);
                obj = ((C44176Jff) this.A01).A02;
                mailboxObservableImpl = (MailboxObservableImpl) obj;
                mailboxObservableImpl.setResult(nonNullNotificationValue);
                return;
            case 9:
                map.getClass();
                abstractC1345065z = K3W.A00;
                str = this.A02;
                i = 388;
                nonNullNotificationValue = MailboxFeature.getNonNullNotificationValue(abstractC1345065z, map, str, i);
                obj = ((C44176Jff) this.A01).A02;
                mailboxObservableImpl = (MailboxObservableImpl) obj;
                mailboxObservableImpl.setResult(nonNullNotificationValue);
                return;
            case 10:
                map.getClass();
                nonNullNotificationValue = MailboxFeature.getNonNullNotificationValue(K3W.A00, map, this.A02, 318);
                obj = ((JVY) this.A01).A02;
                mailboxObservableImpl = (MailboxObservableImpl) obj;
                mailboxObservableImpl.setResult(nonNullNotificationValue);
                return;
            case 11:
                map.getClass();
                nonNullNotificationValue = MailboxFeature.getNonNullNotificationValue(K3W.A00, map, this.A02, 320);
                obj = ((LUF) this.A01).A02;
                mailboxObservableImpl = (MailboxObservableImpl) obj;
                mailboxObservableImpl.setResult(nonNullNotificationValue);
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                map.getClass();
                nonNullNotificationValue = MailboxFeature.getNonNullNotificationValue(K3W.A00, map, this.A02, 319);
                obj = ((LUF) this.A01).A02;
                mailboxObservableImpl = (MailboxObservableImpl) obj;
                mailboxObservableImpl.setResult(nonNullNotificationValue);
                return;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                map.getClass();
                nonNullNotificationValue = MailboxFeature.getNonNullNotificationValue(K3W.A00, map, this.A02, 389);
                obj = ((LUF) this.A01).A02;
                mailboxObservableImpl = (MailboxObservableImpl) obj;
                mailboxObservableImpl.setResult(nonNullNotificationValue);
                return;
            case 14:
                map.getClass();
                nonNullNotificationValue = MailboxFeature.getNonNullNotificationValue(K3W.A00, map, this.A02, 347);
                obj = ((JVY) this.A01).A02;
                mailboxObservableImpl = (MailboxObservableImpl) obj;
                mailboxObservableImpl.setResult(nonNullNotificationValue);
                return;
            case Process.SIGTERM /* 15 */:
                map.getClass();
                nonNullNotificationValue = MailboxFeature.getNonNullNotificationValue(K3W.A00, map, this.A02, 353);
                obj = ((LVH) this.A01).A03;
                mailboxObservableImpl = (MailboxObservableImpl) obj;
                mailboxObservableImpl.setResult(nonNullNotificationValue);
                return;
            case 16:
                map.getClass();
                abstractC1345065z = K3W.A00;
                str = this.A02;
                i = 378;
                nonNullNotificationValue = MailboxFeature.getNonNullNotificationValue(abstractC1345065z, map, str, i);
                obj = ((C44176Jff) this.A01).A02;
                mailboxObservableImpl = (MailboxObservableImpl) obj;
                mailboxObservableImpl.setResult(nonNullNotificationValue);
                return;
            case 17:
                map.getClass();
                nonNullNotificationValue = MailboxFeature.getNonNullNotificationValue(K3W.A00, map, this.A02, 390);
                mailboxObservableImpl = ((LV1) this.A01).A01;
                mailboxObservableImpl.setResult(nonNullNotificationValue);
                return;
            case 18:
                map.getClass();
                nonNullNotificationValue = MailboxFeature.getNonNullNotificationValue(K3W.A00, map, this.A02, 382);
                obj = ((JVY) this.A01).A03;
                mailboxObservableImpl = (MailboxObservableImpl) obj;
                mailboxObservableImpl.setResult(nonNullNotificationValue);
                return;
            case Process.SIGSTOP /* 19 */:
                map.getClass();
                AbstractC1345065z abstractC1345065z6 = K3X.A00;
                boolean booleanValue3 = ((Boolean) MailboxFeature.getNonNullNotificationValue(abstractC1345065z6, map, this.A02, 42)).booleanValue();
                MsysError msysError = (MsysError) map.get(abstractC1345065z6.A00(40));
                mailboxObservableImpl2 = (MailboxObservableImpl) ((JVY) this.A01).A02;
                obj2 = new C47484KyD(msysError, booleanValue3);
                mailboxObservableImpl2.setResult(obj2);
                return;
            case 20:
                map.getClass();
                AbstractC1345065z abstractC1345065z7 = K3X.A00;
                MailboxFeature.getNonNullNotificationValue(abstractC1345065z7, map, this.A02, 30);
                MsysError msysError2 = (MsysError) map.get(abstractC1345065z7.A00(28));
                mailboxObservableImpl2 = (MailboxObservableImpl) ((LUO) this.A01).A02;
                obj2 = new C47222Ktv(msysError2);
                mailboxObservableImpl2.setResult(obj2);
                return;
            case 21:
                map.getClass();
                AbstractC1345065z abstractC1345065z8 = K3X.A00;
                boolean booleanValue4 = ((Boolean) MailboxFeature.getNonNullNotificationValue(abstractC1345065z8, map, this.A02, 46)).booleanValue();
                MsysError msysError3 = (MsysError) map.get(abstractC1345065z8.A00(44));
                mailboxObservableImpl2 = (MailboxObservableImpl) ((LUT) this.A01).A02;
                obj2 = new C47486KyF(msysError3, booleanValue4);
                mailboxObservableImpl2.setResult(obj2);
                return;
            case 22:
                map.getClass();
                AbstractC1345065z abstractC1345065z9 = K3X.A00;
                boolean booleanValue5 = ((Boolean) MailboxFeature.getNonNullNotificationValue(abstractC1345065z9, map, this.A02, 49)).booleanValue();
                MsysError msysError4 = (MsysError) map.get(abstractC1345065z9.A00(47));
                mailboxObservableImpl2 = ((C48193LUr) this.A01).A02;
                obj2 = new C47488KyH(msysError4, booleanValue5);
                mailboxObservableImpl2.setResult(obj2);
                return;
            case 23:
                map.getClass();
                AbstractC1345065z abstractC1345065z10 = K3X.A00;
                boolean booleanValue6 = ((Boolean) MailboxFeature.getNonNullNotificationValue(abstractC1345065z10, map, this.A02, 49)).booleanValue();
                MsysError msysError5 = (MsysError) map.get(abstractC1345065z10.A00(47));
                mailboxObservableImpl2 = ((LUX) this.A01).A02;
                obj2 = new C47487KyG(msysError5, booleanValue6);
                mailboxObservableImpl2.setResult(obj2);
                return;
            case 24:
                map.getClass();
                AbstractC1345065z abstractC1345065z11 = K3X.A00;
                MailboxFeature.getNonNullNotificationValue(abstractC1345065z11, map, this.A02, 52);
                MsysError msysError6 = (MsysError) map.get(abstractC1345065z11.A00(50));
                mailboxObservableImpl2 = (MailboxObservableImpl) ((C48184LUi) this.A01).A02;
                obj2 = new C47223Ktw(msysError6);
                mailboxObservableImpl2.setResult(obj2);
                return;
            case 25:
                map.getClass();
                AbstractC1345065z abstractC1345065z12 = K3X.A00;
                Number number = (Number) MailboxFeature.getNonNullNotificationValue(abstractC1345065z12, map, this.A02, 33);
                MsysError msysError7 = (MsysError) map.get(abstractC1345065z12.A00(32));
                mailboxObservableImpl2 = ((LV2) this.A01).A03;
                obj2 = new C47489KyI(msysError7, number);
                mailboxObservableImpl2.setResult(obj2);
                return;
            case 26:
                map.getClass();
                AbstractC1345065z abstractC1345065z13 = K3X.A00;
                Number number2 = (Number) MailboxFeature.getNonNullNotificationValue(abstractC1345065z13, map, this.A02, 33);
                MsysError msysError8 = (MsysError) map.get(abstractC1345065z13.A00(32));
                mailboxObservableImpl2 = ((LV3) this.A01).A04;
                obj2 = new C47490KyJ(msysError8, number2);
                mailboxObservableImpl2.setResult(obj2);
                return;
            case 27:
                map.getClass();
                AbstractC1345065z abstractC1345065z14 = K3X.A00;
                Number number3 = (Number) MailboxFeature.getNonNullNotificationValue(abstractC1345065z14, map, this.A02, 33);
                MsysError msysError9 = (MsysError) map.get(abstractC1345065z14.A00(32));
                mailboxObservableImpl2 = (MailboxObservableImpl) ((C48188LUm) this.A01).A04;
                obj2 = new C47491KyK(msysError9, number3);
                mailboxObservableImpl2.setResult(obj2);
                return;
            case 28:
                map.getClass();
                AbstractC1345065z abstractC1345065z15 = K3X.A00;
                Map map2 = (Map) map.get(abstractC1345065z15.A00(23));
                MsysError msysError10 = (MsysError) map.get(abstractC1345065z15.A00(15));
                boolean booleanValue7 = ((Boolean) MailboxFeature.getNonNullNotificationValue(abstractC1345065z15, map, this.A02, 14)).booleanValue();
                mailboxObservableImpl2 = (MailboxObservableImpl) ((C48189LUn) this.A01).A03;
                obj2 = new C47594L0e(msysError10, map2, booleanValue7);
                mailboxObservableImpl2.setResult(obj2);
                return;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                map.getClass();
                nonNullNotificationValue = MailboxFeature.getNonNullNotificationValue(K3O.A00, map, this.A02, 3);
                obj = ((LVH) this.A01).A03;
                mailboxObservableImpl = (MailboxObservableImpl) obj;
                mailboxObservableImpl.setResult(nonNullNotificationValue);
                return;
            case 30:
                map.getClass();
                abstractC1345065z = K3O.A00;
                str = this.A02;
                i = 0;
                nonNullNotificationValue = MailboxFeature.getNonNullNotificationValue(abstractC1345065z, map, str, i);
                obj = ((C44176Jff) this.A01).A02;
                mailboxObservableImpl = (MailboxObservableImpl) obj;
                mailboxObservableImpl.setResult(nonNullNotificationValue);
                return;
            case 31:
                map.getClass();
                nonNullNotificationValue = MailboxFeature.getNonNullNotificationValue(K3Y.A00, map, this.A02, 21);
                mailboxObservableImpl = ((C48185LUj) this.A01).A02;
                mailboxObservableImpl.setResult(nonNullNotificationValue);
                return;
            case 32:
                map.getClass();
                AbstractC1345065z abstractC1345065z16 = K3Y.A00;
                String str3 = this.A02;
                Map map3 = (Map) MailboxFeature.getNonNullNotificationValue(abstractC1345065z16, map, str3, 23);
                Map map4 = (Map) MailboxFeature.getNonNullNotificationValue(abstractC1345065z16, map, str3, 19);
                Map map5 = (Map) MailboxFeature.getNonNullNotificationValue(abstractC1345065z16, map, str3, 0);
                mailboxObservableImpl2 = ((C48186LUk) this.A01).A02;
                obj2 = new C47595L0f(map3, map4, map5);
                mailboxObservableImpl2.setResult(obj2);
                return;
            case 33:
                map.getClass();
                AbstractC1345065z abstractC1345065z17 = K3Y.A00;
                String str4 = this.A02;
                List list = (List) MailboxFeature.getNonNullNotificationValue(abstractC1345065z17, map, str4, 24);
                List list2 = (List) MailboxFeature.getNonNullNotificationValue(abstractC1345065z17, map, str4, 20);
                Map map6 = (Map) MailboxFeature.getNonNullNotificationValue(abstractC1345065z17, map, str4, 0);
                mailboxObservableImpl2 = ((JVA) this.A01).A03;
                obj2 = new JV5(list, list2, map6);
                mailboxObservableImpl2.setResult(obj2);
                return;
            case 34:
                map.getClass();
                AbstractC1345065z abstractC1345065z18 = K3Y.A00;
                String str5 = this.A02;
                List list3 = (List) MailboxFeature.getNonNullNotificationValue(abstractC1345065z18, map, str5, 25);
                Map map7 = (Map) MailboxFeature.getNonNullNotificationValue(abstractC1345065z18, map, str5, 0);
                mailboxObservableImpl2 = ((C48195LUt) this.A01).A02;
                obj2 = new C47493KyM(list3, map7);
                mailboxObservableImpl2.setResult(obj2);
                return;
            case 35:
                map.getClass();
                nonNullNotificationValue = MailboxFeature.getNonNullNotificationValue(K3Y.A00, map, this.A02, 2);
                mailboxObservableImpl = ((LUY) this.A01).A02;
                mailboxObservableImpl.setResult(nonNullNotificationValue);
                return;
            case 36:
                map.getClass();
                nonNullNotificationValue = MailboxFeature.getNonNullNotificationValue(K3Y.A00, map, this.A02, 1);
                obj = ((C48189LUn) this.A01).A04;
                mailboxObservableImpl = (MailboxObservableImpl) obj;
                mailboxObservableImpl.setResult(nonNullNotificationValue);
                return;
            case 37:
                map.getClass();
                nonNullNotificationValue = MailboxFeature.getNonNullNotificationValue(K3Y.A00, map, this.A02, 16);
                obj = ((LUQ) this.A01).A04;
                mailboxObservableImpl = (MailboxObservableImpl) obj;
                mailboxObservableImpl.setResult(nonNullNotificationValue);
                return;
            case 38:
                map.getClass();
                abstractC1345065z2 = K3Y.A00;
                str2 = this.A02;
                i2 = 18;
                nonNullNotificationValue = MailboxFeature.getNonNullNotificationValue(abstractC1345065z2, map, str2, i2);
                obj = ((JRT) this.A01).A03;
                mailboxObservableImpl = (MailboxObservableImpl) obj;
                mailboxObservableImpl.setResult(nonNullNotificationValue);
                return;
            case 39:
                map.getClass();
                abstractC1345065z2 = K3Y.A00;
                str2 = this.A02;
                i2 = 26;
                nonNullNotificationValue = MailboxFeature.getNonNullNotificationValue(abstractC1345065z2, map, str2, i2);
                obj = ((JRT) this.A01).A03;
                mailboxObservableImpl = (MailboxObservableImpl) obj;
                mailboxObservableImpl.setResult(nonNullNotificationValue);
                return;
            case 40:
                map.getClass();
                abstractC1345065z2 = K3Y.A00;
                str2 = this.A02;
                i2 = 17;
                nonNullNotificationValue = MailboxFeature.getNonNullNotificationValue(abstractC1345065z2, map, str2, i2);
                obj = ((JRT) this.A01).A03;
                mailboxObservableImpl = (MailboxObservableImpl) obj;
                mailboxObservableImpl.setResult(nonNullNotificationValue);
                return;
            case Seq.NULL_REFNUM /* 41 */:
                map.getClass();
                AbstractC1345065z abstractC1345065z19 = C1345666g.A00;
                String str6 = this.A02;
                CQLResultSet cQLResultSet = (CQLResultSet) MailboxFeature.getNonNullNotificationValue(abstractC1345065z19, map, str6, 28);
                CQLResultSet cQLResultSet2 = (CQLResultSet) MailboxFeature.getNonNullNotificationValue(abstractC1345065z19, map, str6, 23);
                Map map8 = (Map) MailboxFeature.getNonNullNotificationValue(abstractC1345065z19, map, str6, 19);
                CQLResultSet cQLResultSet3 = (CQLResultSet) MailboxFeature.getNonNullNotificationValue(abstractC1345065z19, map, str6, 3);
                CQLResultSet cQLResultSet4 = (CQLResultSet) MailboxFeature.getNonNullNotificationValue(abstractC1345065z19, map, str6, 26);
                CQLResultSet cQLResultSet5 = (CQLResultSet) map.get(abstractC1345065z19.A00(15));
                CQLResultSet cQLResultSet6 = (CQLResultSet) map.get(abstractC1345065z19.A00(16));
                CQLResultSet cQLResultSet7 = (CQLResultSet) map.get(abstractC1345065z19.A00(29));
                mailboxObservableImpl2 = ((C48197LUv) this.A01).A07;
                ?? abstractC1351869s = new AbstractC1351869s(cQLResultSet);
                ?? abstractC1351869s2 = new AbstractC1351869s(cQLResultSet2);
                ?? abstractC1351869s3 = new AbstractC1351869s(cQLResultSet3);
                ?? abstractC1351869s4 = new AbstractC1351869s(cQLResultSet4);
                K4A k4a = 0;
                if (cQLResultSet5 == null) {
                    k4d = 0;
                } else {
                    k4d = new AbstractC1351869s(cQLResultSet5);
                }
                if (cQLResultSet6 == null) {
                    c45309K3m = 0;
                } else {
                    c45309K3m = new AbstractC1351869s(cQLResultSet6);
                }
                if (cQLResultSet7 != null) {
                    k4a = new AbstractC1351869s(cQLResultSet7);
                }
                obj2 = new C47700L4h(abstractC1351869s3, k4d, c45309K3m, abstractC1351869s4, abstractC1351869s2, abstractC1351869s, k4a, map8);
                mailboxObservableImpl2.setResult(obj2);
                return;
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                map.getClass();
                abstractC1345065z2 = C1345666g.A00;
                str2 = this.A02;
                i2 = 12;
                nonNullNotificationValue = MailboxFeature.getNonNullNotificationValue(abstractC1345065z2, map, str2, i2);
                obj = ((JRT) this.A01).A03;
                mailboxObservableImpl = (MailboxObservableImpl) obj;
                mailboxObservableImpl.setResult(nonNullNotificationValue);
                return;
            case 43:
                map.getClass();
                abstractC1345065z2 = C1345666g.A00;
                str2 = this.A02;
                i2 = 14;
                nonNullNotificationValue = MailboxFeature.getNonNullNotificationValue(abstractC1345065z2, map, str2, i2);
                obj = ((JRT) this.A01).A03;
                mailboxObservableImpl = (MailboxObservableImpl) obj;
                mailboxObservableImpl.setResult(nonNullNotificationValue);
                return;
            case 44:
                map.getClass();
                AbstractC1345065z abstractC1345065z20 = K3P.A00;
                String str7 = this.A02;
                MailboxFeature.getNonNullNotificationValue(abstractC1345065z20, map, str7, 5);
                String str8 = (String) MailboxFeature.getNonNullNotificationValue(abstractC1345065z20, map, str7, 0);
                mailboxObservableImpl2 = ((LV7) this.A01).A01;
                obj2 = new C47225Kty(str8);
                mailboxObservableImpl2.setResult(obj2);
                return;
            case 45:
                map.getClass();
                abstractC1345065z = K3Q.A00;
                str = this.A02;
                i = 0;
                nonNullNotificationValue = MailboxFeature.getNonNullNotificationValue(abstractC1345065z, map, str, i);
                obj = ((C44176Jff) this.A01).A02;
                mailboxObservableImpl = (MailboxObservableImpl) obj;
                mailboxObservableImpl.setResult(nonNullNotificationValue);
                return;
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                map.getClass();
                nonNullNotificationValue = MailboxFeature.getNonNullNotificationValue(K3T.A00, map, this.A02, 0);
                obj = ((C48184LUi) this.A01).A03;
                mailboxObservableImpl = (MailboxObservableImpl) obj;
                mailboxObservableImpl.setResult(nonNullNotificationValue);
                return;
            case 47:
                map.getClass();
                nonNullNotificationValue = MailboxFeature.getNonNullNotificationValue(K3T.A00, map, this.A02, 5);
                obj = ((C48191LUp) this.A01).A03;
                mailboxObservableImpl = (MailboxObservableImpl) obj;
                mailboxObservableImpl.setResult(nonNullNotificationValue);
                return;
            case 48:
                map.getClass();
                nonNullNotificationValue = MailboxFeature.getNonNullNotificationValue(K3U.A00, map, this.A02, 29);
                obj = ((C48181LUf) this.A01).A04;
                mailboxObservableImpl = (MailboxObservableImpl) obj;
                mailboxObservableImpl.setResult(nonNullNotificationValue);
                return;
            case 49:
                map.getClass();
                nonNullNotificationValue = MailboxFeature.getNonNullNotificationValue(K3U.A00, map, this.A02, 33);
                obj = ((C48190LUo) this.A01).A02;
                mailboxObservableImpl = (MailboxObservableImpl) obj;
                mailboxObservableImpl.setResult(nonNullNotificationValue);
                return;
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
                map.getClass();
                nonNullNotificationValue = MailboxFeature.getNonNullNotificationValue(K3U.A00, map, this.A02, 35);
                mailboxObservableImpl = ((LUU) this.A01).A02;
                mailboxObservableImpl.setResult(nonNullNotificationValue);
                return;
            case 51:
                map.getClass();
                nonNullNotificationValue = MailboxFeature.getNonNullNotificationValue(K3U.A00, map, this.A02, 34);
                obj = ((C48190LUo) this.A01).A02;
                mailboxObservableImpl = (MailboxObservableImpl) obj;
                mailboxObservableImpl.setResult(nonNullNotificationValue);
                return;
            case 52:
                map.getClass();
                nonNullNotificationValue = MailboxFeature.getNonNullNotificationValue(K3U.A00, map, this.A02, 26);
                mailboxObservableImpl = ((LV4) this.A01).A03;
                mailboxObservableImpl.setResult(nonNullNotificationValue);
                return;
            case 53:
                map.getClass();
                AbstractC1345065z abstractC1345065z21 = K3a.A00;
                MailboxFeature.getNonNullNotificationValue(abstractC1345065z21, map, this.A02, 25);
                Number number4 = (Number) map.get(abstractC1345065z21.A00(26));
                Number number5 = (Number) map.get(abstractC1345065z21.A00(29));
                Boolean bool = (Boolean) map.get(abstractC1345065z21.A00(27));
                String str9 = (String) map.get(abstractC1345065z21.A00(31));
                Number number6 = (Number) map.get(abstractC1345065z21.A00(30));
                List list4 = (List) map.get(abstractC1345065z21.A00(16));
                mailboxObservableImpl2 = (MailboxObservableImpl) ((LVJ) this.A01).A04;
                obj2 = new C47684L3r(bool, number4, number5, number6, str9, list4);
                mailboxObservableImpl2.setResult(obj2);
                return;
            default:
                map.getClass();
                AbstractC1345065z abstractC1345065z22 = K3a.A00;
                String str10 = this.A02;
                Number number7 = (Number) MailboxFeature.getNonNullNotificationValue(abstractC1345065z22, map, str10, 42);
                boolean booleanValue8 = ((Boolean) MailboxFeature.getNonNullNotificationValue(abstractC1345065z22, map, str10, 43)).booleanValue();
                Number number8 = (Number) map.get(abstractC1345065z22.A00(38));
                byte[] bArr = (byte[]) map.get(abstractC1345065z22.A00(34));
                android.net.Uri uri = (android.net.Uri) map.get(abstractC1345065z22.A00(40));
                map.get(abstractC1345065z22.A00(39));
                MailboxHealthReport mailboxHealthReport = (MailboxHealthReport) map.get(abstractC1345065z22.A00(41));
                mailboxObservableImpl2 = (MailboxObservableImpl) ((LVI) this.A01).A04;
                obj2 = new C47685L3s(uri, mailboxHealthReport, number7, number8, bArr, booleanValue8);
                mailboxObservableImpl2.setResult(obj2);
                return;
        }
    }
}
