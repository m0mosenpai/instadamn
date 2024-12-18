package X;

import com.facebook.forker.Process;
import com.facebook.hyperthrift.HyperThriftBase;
import org.json.JSONObject;

/* renamed from: X.Od3, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55144Od3 {
    public final C51759Mti A00;
    public final String A01;
    public final InterfaceC09390do A0H = A01(this, 28);
    public final InterfaceC09390do A0M = A01(this, 34);
    public final InterfaceC09390do A03 = A01(this, 14);
    public final InterfaceC09390do A0C = A01(this, 23);
    public final InterfaceC09390do A0L = A01(this, 33);
    public final InterfaceC09390do A05 = A01(this, 16);
    public final InterfaceC09390do A0N = A01(this, 35);
    public final InterfaceC09390do A0P = A01(this, 38);
    public final InterfaceC09390do A0J = A01(this, 31);
    public final InterfaceC09390do A0D = A01(this, 24);
    public final InterfaceC09390do A0K = A01(this, 32);
    public final InterfaceC09390do A0E = A01(this, 25);
    public final InterfaceC09390do A0I = A01(this, 30);
    public final InterfaceC09390do A0Q = A01(this, 29);
    public final InterfaceC09390do A0O = A01(this, 36);
    public final InterfaceC09390do A0R = A01(this, 37);
    public final InterfaceC09390do A02 = A01(this, 13);
    public final InterfaceC09390do A0G = A01(this, 27);
    public final InterfaceC09390do A0A = A01(this, 21);
    public final InterfaceC09390do A0B = A01(this, 22);
    public final InterfaceC09390do A0F = A01(this, 26);
    public final InterfaceC09390do A04 = A01(this, 15);
    public final InterfaceC09390do A09 = A01(this, 20);
    public final InterfaceC09390do A08 = A01(this, 19);
    public final InterfaceC09390do A07 = A01(this, 18);
    public final InterfaceC09390do A06 = A01(this, 17);

    public static final String A00(C55144Od3 c55144Od3, String str) {
        return (String) AbstractC224517h.A01(AbstractC224517h.A09(C57728PjH.A00, AbstractC224517h.A05(AbstractC224517h.A09(C57727PjG.A00, AbstractC224517h.A04(new DHI(str, 13), AbstractC001800i.A0o((Iterable) c55144Od3.A0C.getValue()))))));
    }

    public static C17050sx A01(Object obj, int i) {
        return AbstractC09440dt.A01(new C57246PbU(obj, i));
    }

    public static final JSONObject A02(C55144Od3 c55144Od3, String str) {
        return (JSONObject) AbstractC224517h.A01(AbstractC224517h.A09(C57726PjF.A00, AbstractC224517h.A05(AbstractC224517h.A09(C57725PjE.A00, AbstractC224517h.A04(new DHI(str, 12), AbstractC001800i.A0o((Iterable) c55144Od3.A0C.getValue()))))));
    }

    public final Integer A03() {
        return (Integer) ((HyperThriftBase) this.A00.A01).A00(0);
    }

    public final String A04() {
        String str = (String) ((HyperThriftBase) this.A00.A01).A00(4);
        if (str != null) {
            return str;
        }
        throw AbstractC166997dE.A0g();
    }

    public final String A05() {
        return (String) ((HyperThriftBase) this.A00.A01).A00(2);
    }

    public C55144Od3(C51759Mti c51759Mti, String str) {
        this.A00 = c51759Mti;
        this.A01 = str;
    }

    public final String toString() {
        Object obj;
        Integer A03 = A03();
        if (A03 != null && A03.intValue() == 4) {
            obj = this.A02.getValue();
        } else {
            obj = null;
        }
        Integer A032 = A03();
        String str = "Unknown";
        if (A032 != null) {
            switch (A032.intValue()) {
                case 0:
                    str = "JOIN";
                    break;
                case 1:
                    str = "SERVER_MEDIA_UPDATE";
                    break;
                case 2:
                    str = "HANGUP";
                    break;
                case 3:
                    str = "ICE_CANDIDATE";
                    break;
                case 4:
                    str = "RING";
                    break;
                case 5:
                    str = "DISMISS";
                    break;
                case 6:
                    str = "CONFERENCE_STATE";
                    break;
                case 7:
                    str = "ADD_PARTICIPANTS";
                    break;
                case 8:
                    str = "SUBSCRIPTION";
                    break;
                case 9:
                    str = "CLIENT_MEDIA_UPDATE";
                    break;
                case 10:
                    str = "DATA_MESSAGE";
                    break;
                case 11:
                    str = "REMOVE_PARTICIPANTS";
                    break;
                case 18:
                    str = "PING";
                    break;
                case Process.SIGSTOP /* 19 */:
                    str = "P2P_PROTOCOL";
                    break;
                case 20:
                    str = "UPDATE";
                    break;
                case 21:
                    str = "NOTIFY";
                    break;
                case 22:
                    str = "CONNECT";
                    break;
                case 23:
                    str = "CLIENT_EVENT";
                    break;
                case 25:
                    str = "UNSUBSCRIBE";
                    break;
                case 26:
                    str = "APPROVAL";
                    break;
                case 27:
                    str = "TRANSFER";
                    break;
                case 28:
                    str = "WAKEUP";
                    break;
            }
        }
        return AbstractC13670mt.A06("RtcMWThriftPayload[broadcast=%s, videocallId=%s, type=%s, transaction=%s, serverInfoData=%s]", obj, null, str, A05(), A04());
    }
}
