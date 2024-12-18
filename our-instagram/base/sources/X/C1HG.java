package X;

import java.nio.ByteBuffer;

/* renamed from: X.1HG, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1HG extends C19Q implements C1G4 {
    public static final InterfaceC09390do A01 = AbstractC09440dt.A01(C1HH.A00);
    public static final String[] A02;
    public static final String[] A03;
    public static final String[] A04;
    public final C1G4 A00;

    @Override // X.C19Q, X.C19O
    public final void onNewData(C1QW c1qw, C1QY c1qy, ByteBuffer byteBuffer) {
        C73297Xzm c73297Xzm;
        Object value;
        C1R4 c1r4;
        C14360o3.A0B(c1qy, 1);
        C14360o3.A0B(byteBuffer, 2);
        C1R3 c1r3 = C1R3.A03;
        if (((C1R4) c1r3.A02.getValue()).A06) {
            EnumC23341Bw enumC23341Bw = c1qy.A09;
            if (enumC23341Bw == EnumC23341Bw.Video) {
                c73297Xzm = new C73297Xzm(0L, byteBuffer.remaining());
            } else if (enumC23341Bw != EnumC23341Bw.Image) {
                return;
            } else {
                c73297Xzm = new C73297Xzm(byteBuffer.remaining(), 0L);
            }
            C05A c05a = c1r3.A01;
            do {
                value = c05a.getValue();
                c1r4 = (C1R4) value;
            } while (!c05a.AIi(value, C1R4.A02(c1r4, null, null, 0, 0, 511, c1r4.A02 + c73297Xzm.A00, c1r4.A03 + c73297Xzm.A01, false, false, false, false, false)));
        }
    }

    @Override // X.C1G4
    public final InterfaceC27191Tt startRequest(C1QW c1qw, C1QY c1qy, C26511Qg c26511Qg) {
        String str;
        C14360o3.A0B(c1qw, 0);
        C14360o3.A0B(c1qy, 1);
        C14360o3.A0B(c26511Qg, 2);
        C0UO c0uo = C1R3.A03.A02;
        if (((C1R4) c0uo.getValue()).A06) {
            c26511Qg.A01(this);
            if (((C1R4) c0uo.getValue()).A04 == C05F.A0C) {
                String str2 = c1qw.A08;
                boolean A08 = ((C11L) A01.getValue()).A08(str2);
                C26371Ps c26371Ps = new C26371Ps(c1qw);
                if (A08) {
                    str = "allowed";
                } else {
                    c26371Ps.A02(AnonymousClass001.A0R("https://54.183.121.79/FAKE_ZERO_BALANCE_BLOCK/", str2));
                    str = "blocked";
                }
                c26371Ps.A03("fake_zero_balance", str);
                c1qw = c26371Ps.A00();
            }
        }
        InterfaceC27191Tt startRequest = this.A00.startRequest(c1qw, c1qy, c26511Qg);
        C14360o3.A07(startRequest);
        return startRequest;
    }

    static {
        String[] strArr = {"z-p42", "b-", "b."};
        A03 = strArr;
        String[] strArr2 = {"h.", "fbscontenttest"};
        A04 = strArr2;
        A02 = (String[]) AbstractC06960Yn.A0b(strArr, strArr2);
    }

    public C1HG(C1G4 c1g4) {
        this.A00 = c1g4;
    }
}
