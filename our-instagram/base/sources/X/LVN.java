package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.facebook.msys.mca.MailboxNullable;
import com.facebook.msys.mca.MailboxObservableImpl;
import com.facebook.msys.mcf.MsysError;
import com.facebook.msys.mci.CQLResultSet;
import com.facebook.msys.util.NotificationScope;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public final class LVN implements InterfaceC124965l1 {
    public final int A00;
    public final Object A01;

    public LVN(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static MailboxObservableImpl A00(LVN lvn) {
        return (MailboxObservableImpl) ((C44176Jff) lvn.A01).A02;
    }

    public static NotificationScope A01(C124935ky c124935ky, Object obj, String str, int i) {
        return c124935ky.A00(new LVN(obj, i), str);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v99, types: [java.lang.Object, X.Khx] */
    @Override // X.InterfaceC124965l1
    public final void Dh3(Map map) {
        Object A0t;
        MailboxObservableImpl A00;
        Object obj;
        switch (this.A00) {
            case 0:
                ((C48171LTv) this.A01).A01.setResult(null);
                return;
            case 1:
            case 24:
            case 25:
            default:
                A00(this).setResult(null);
                return;
            case 2:
                ((MailboxObservableImpl) ((LUF) this.A01).A02).setResult(null);
                return;
            case 3:
                map.getClass();
                A0t = AbstractC43593JPy.A0t(K3W.A00, map, 177);
                A00 = A00(this);
                A00.setResult(new MailboxNullable(A0t));
                return;
            case 4:
                map.getClass();
                A0t = AbstractC43593JPy.A0t(K3W.A00, map, 246);
                A00 = A00(this);
                A00.setResult(new MailboxNullable(A0t));
                return;
            case 5:
                map.getClass();
                CQLResultSet cQLResultSet = (CQLResultSet) AbstractC43593JPy.A0t(K3W.A00, map, 310);
                A00 = A00(this);
                if (cQLResultSet != null) {
                    A0t = new AbstractC1351869s(cQLResultSet);
                    A00.setResult(new MailboxNullable(A0t));
                    return;
                }
                A0t = null;
                A00.setResult(new MailboxNullable(A0t));
                return;
            case 6:
                map.getClass();
                A0t = AbstractC43593JPy.A0t(K3W.A00, map, 375);
                obj = ((JVY) this.A01).A02;
                A00 = (MailboxObservableImpl) obj;
                A00.setResult(new MailboxNullable(A0t));
                return;
            case 7:
                map.getClass();
                AbstractC1345065z abstractC1345065z = K3W.A00;
                ((MailboxObservableImpl) ((LUR) this.A01).A03).setResult(new C47479Ky8((String) AbstractC43593JPy.A0t(abstractC1345065z, map, 373), (String) AbstractC43593JPy.A0t(abstractC1345065z, map, 374)));
                return;
            case 8:
                map.getClass();
                AbstractC1345065z abstractC1345065z2 = K3W.A00;
                A00(this).setResult(new C47478Ky7((Number) AbstractC43593JPy.A0t(abstractC1345065z2, map, 366), (Number) AbstractC43593JPy.A0t(abstractC1345065z2, map, 367)));
                return;
            case 9:
                map.getClass();
                A0t = AbstractC43593JPy.A0t(K3W.A00, map, 370);
                obj = ((JVY) this.A01).A02;
                A00 = (MailboxObservableImpl) obj;
                A00.setResult(new MailboxNullable(A0t));
                return;
            case 10:
                map.getClass();
                A0t = AbstractC43593JPy.A0t(K3W.A00, map, 372);
                A00 = A00(this);
                A00.setResult(new MailboxNullable(A0t));
                return;
            case 11:
                map.getClass();
                AbstractC1345065z abstractC1345065z3 = K3W.A00;
                A00(this).setResult(new C47477Ky6((String) AbstractC43593JPy.A0t(abstractC1345065z3, map, 365), (Number) AbstractC43593JPy.A0t(abstractC1345065z3, map, 364)));
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                map.getClass();
                A0t = AbstractC43593JPy.A0t(K3W.A00, map, 358);
                obj = ((LUF) this.A01).A02;
                A00 = (MailboxObservableImpl) obj;
                A00.setResult(new MailboxNullable(A0t));
                return;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                map.getClass();
                A0t = AbstractC43593JPy.A0t(K3W.A00, map, 362);
                A00 = A00(this);
                A00.setResult(new MailboxNullable(A0t));
                return;
            case 14:
                map.getClass();
                CQLResultSet cQLResultSet2 = (CQLResultSet) AbstractC43593JPy.A0t(K3W.A00, map, 192);
                A00 = A00(this);
                if (cQLResultSet2 != null) {
                    A0t = new AbstractC1351869s(cQLResultSet2);
                    A00.setResult(new MailboxNullable(A0t));
                    return;
                }
                A0t = null;
                A00.setResult(new MailboxNullable(A0t));
                return;
            case Process.SIGTERM /* 15 */:
                map.getClass();
                A0t = AbstractC43593JPy.A0t(K3X.A00, map, 5);
                obj = ((LUF) this.A01).A02;
                A00 = (MailboxObservableImpl) obj;
                A00.setResult(new MailboxNullable(A0t));
                return;
            case 16:
                map.getClass();
                AbstractC1345065z abstractC1345065z4 = K3X.A00;
                List list = (List) AbstractC43593JPy.A0t(abstractC1345065z4, map, 36);
                A00(this).setResult(new C47481KyA((MsysError) AbstractC43593JPy.A0t(abstractC1345065z4, map, 34), list));
                return;
            case 17:
                map.getClass();
                A0t = AbstractC43593JPy.A0t(K3X.A00, map, 1);
                obj = ((LVG) this.A01).A03;
                A00 = (MailboxObservableImpl) obj;
                A00.setResult(new MailboxNullable(A0t));
                return;
            case 18:
                map.getClass();
                AbstractC1345065z abstractC1345065z5 = K3X.A00;
                ((MailboxObservableImpl) ((C48189LUn) this.A01).A03).setResult(new C47483KyC((android.net.Uri) AbstractC43593JPy.A0t(abstractC1345065z5, map, 59), (MsysError) AbstractC43593JPy.A0t(abstractC1345065z5, map, 58)));
                return;
            case Process.SIGSTOP /* 19 */:
                map.getClass();
                AbstractC1345065z abstractC1345065z6 = K3X.A00;
                ((LUJ) this.A01).A03.setResult(new C47485KyE((android.net.Uri) AbstractC43593JPy.A0t(abstractC1345065z6, map, 61), (MsysError) AbstractC43593JPy.A0t(abstractC1345065z6, map, 60)));
                return;
            case 20:
                map.getClass();
                AbstractC1345065z abstractC1345065z7 = K3X.A00;
                ((C48201LUz) this.A01).A04.setResult(new C47482KyB((android.net.Uri) AbstractC43593JPy.A0t(abstractC1345065z7, map, 7), (MsysError) AbstractC43593JPy.A0t(abstractC1345065z7, map, 6)));
                return;
            case 21:
                map.getClass();
                AbstractC1345065z abstractC1345065z8 = K3X.A00;
                String str = (String) AbstractC43593JPy.A0t(abstractC1345065z8, map, 9);
                ((LV5) this.A01).A08.setResult(new C47492KyL((MsysError) AbstractC43593JPy.A0t(abstractC1345065z8, map, 8), str));
                return;
            case 22:
                map.getClass();
                AbstractC1345065z abstractC1345065z9 = C1345666g.A00;
                ((LV0) this.A01).A03.setResult(new C47494KyN((Number) AbstractC43593JPy.A0t(abstractC1345065z9, map, 18), (Number) AbstractC43593JPy.A0t(abstractC1345065z9, map, 17)));
                return;
            case 23:
                ((C48198LUw) this.A01).A04.setResult(null);
                return;
            case 26:
                map.getClass();
                CQLResultSet cQLResultSet3 = (CQLResultSet) AbstractC43593JPy.A0t(K3Q.A00, map, 16);
                A00 = (MailboxObservableImpl) ((LVG) this.A01).A03;
                if (cQLResultSet3 != null) {
                    A0t = new AbstractC1351869s(cQLResultSet3);
                    A00.setResult(new MailboxNullable(A0t));
                    return;
                }
                A0t = null;
                A00.setResult(new MailboxNullable(A0t));
                return;
            case 27:
                map.getClass();
                CQLResultSet cQLResultSet4 = (CQLResultSet) AbstractC43593JPy.A0t(K3Q.A00, map, 13);
                A00 = ((C48172LTw) this.A01).A01;
                if (cQLResultSet4 != null) {
                    A0t = new AbstractC1351869s(cQLResultSet4);
                    A00.setResult(new MailboxNullable(A0t));
                    return;
                }
                A0t = null;
                A00.setResult(new MailboxNullable(A0t));
                return;
            case 28:
                map.getClass();
                CQLResultSet cQLResultSet5 = (CQLResultSet) AbstractC43593JPy.A0t(K3Q.A00, map, 19);
                A00 = (MailboxObservableImpl) ((LUR) this.A01).A02;
                if (cQLResultSet5 != null) {
                    A0t = new AbstractC1351869s(cQLResultSet5);
                    A00.setResult(new MailboxNullable(A0t));
                    return;
                }
                A0t = null;
                A00.setResult(new MailboxNullable(A0t));
                return;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                map.getClass();
                CQLResultSet cQLResultSet6 = (CQLResultSet) AbstractC43593JPy.A0t(K3Q.A00, map, 20);
                A00 = ((C48177LUb) this.A01).A02;
                if (cQLResultSet6 != null) {
                    A0t = new AbstractC1351869s(cQLResultSet6);
                    A00.setResult(new MailboxNullable(A0t));
                    return;
                }
                A0t = null;
                A00.setResult(new MailboxNullable(A0t));
                return;
            case 30:
                map.getClass();
                CQLResultSet cQLResultSet7 = (CQLResultSet) AbstractC43593JPy.A0t(K3R.A00, map, 8);
                A00 = (MailboxObservableImpl) ((LVG) this.A01).A03;
                if (cQLResultSet7 != null) {
                    A0t = new AbstractC1351869s(cQLResultSet7);
                    A00.setResult(new MailboxNullable(A0t));
                    return;
                }
                A0t = null;
                A00.setResult(new MailboxNullable(A0t));
                return;
            case 31:
                map.getClass();
                CQLResultSet cQLResultSet8 = (CQLResultSet) AbstractC43593JPy.A0t(K3R.A00, map, 7);
                A00 = (MailboxObservableImpl) ((LVG) this.A01).A03;
                if (cQLResultSet8 != null) {
                    A0t = new AbstractC1351869s(cQLResultSet8);
                    A00.setResult(new MailboxNullable(A0t));
                    return;
                }
                A0t = null;
                A00.setResult(new MailboxNullable(A0t));
                return;
            case 32:
                map.getClass();
                CQLResultSet cQLResultSet9 = (CQLResultSet) AbstractC43593JPy.A0t(K3R.A00, map, 5);
                A00 = A00(this);
                if (cQLResultSet9 != null) {
                    A0t = new AbstractC1351869s(cQLResultSet9);
                    A00.setResult(new MailboxNullable(A0t));
                    return;
                }
                A0t = null;
                A00.setResult(new MailboxNullable(A0t));
                return;
            case 33:
                map.getClass();
                Object obj2 = map.get("MCATaskCompletionStateUserInfoKey");
                obj2.getClass();
                int A0H = AbstractC166987dD.A0H(obj2);
                Integer num = (Integer) map.get("MCATaskCompletionErrorCodeUserInfoKey");
                map.get("MCATaskCompletionErrorTitleUserInfoKey");
                MailboxObservableImpl mailboxObservableImpl = (MailboxObservableImpl) this.A01;
                ?? obj3 = new Object();
                obj3.A00 = A0H;
                obj3.A01 = num;
                mailboxObservableImpl.setResult(obj3);
                return;
            case 34:
                map.getClass();
                A0t = AbstractC43593JPy.A0t(K3S.A00, map, 1);
                A00 = ((LV6) this.A01).A00;
                A00.setResult(new MailboxNullable(A0t));
                return;
            case 35:
                map.getClass();
                CQLResultSet cQLResultSet10 = (CQLResultSet) AbstractC43593JPy.A0t(K3T.A00, map, 10);
                A00 = A00(this);
                if (cQLResultSet10 != null) {
                    A0t = new AbstractC1351869s(cQLResultSet10);
                    A00.setResult(new MailboxNullable(A0t));
                    return;
                }
                A0t = null;
                A00.setResult(new MailboxNullable(A0t));
                return;
            case 36:
                map.getClass();
                AbstractC1345065z abstractC1345065z10 = K3T.A00;
                Number number = (Number) AbstractC43593JPy.A0t(abstractC1345065z10, map, 4);
                ((MailboxObservableImpl) ((LVH) this.A01).A03).setResult(new C47501KyU((String) AbstractC43593JPy.A0t(abstractC1345065z10, map, 2), number));
                return;
            case 37:
                map.getClass();
                CQLResultSet cQLResultSet11 = (CQLResultSet) AbstractC43593JPy.A0t(K3U.A00, map, 28);
                A00 = A00(this);
                if (cQLResultSet11 != null) {
                    A0t = new AbstractC1351869s(cQLResultSet11);
                    A00.setResult(new MailboxNullable(A0t));
                    return;
                }
                A0t = null;
                A00.setResult(new MailboxNullable(A0t));
                return;
            case 38:
                map.getClass();
                A0t = AbstractC43593JPy.A0t(K3Z.A00, map, 1);
                obj = ((C48182LUg) this.A01).A04;
                A00 = (MailboxObservableImpl) obj;
                A00.setResult(new MailboxNullable(A0t));
                return;
            case 39:
                ((LU9) this.A01).A00.setResult(null);
                return;
            case 40:
                map.getClass();
                CQLResultSet cQLResultSet12 = (CQLResultSet) AbstractC43593JPy.A0t(K3V.A00, map, 13);
                A00 = A00(this);
                if (cQLResultSet12 != null) {
                    A0t = new AbstractC1351869s(cQLResultSet12);
                    A00.setResult(new MailboxNullable(A0t));
                    return;
                }
                A0t = null;
                A00.setResult(new MailboxNullable(A0t));
                return;
            case Seq.NULL_REFNUM /* 41 */:
                map.getClass();
                A0t = AbstractC43593JPy.A0t(C91S.A00, map, 2);
                A00 = A00(this);
                A00.setResult(new MailboxNullable(A0t));
                return;
        }
    }
}
