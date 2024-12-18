package X;

import android.util.Base64;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.react.modules.dialog.DialogModule;
import com.google.common.collect.ImmutableList;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;

/* loaded from: classes8.dex */
public final class L75 {
    public final /* synthetic */ L38 A00;
    public final /* synthetic */ MPT A01;
    public final /* synthetic */ byte[] A02;

    public L75(L38 l38, MPT mpt, byte[] bArr) {
        this.A00 = l38;
        this.A02 = bArr;
        this.A01 = mpt;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.Khz, java.lang.Object] */
    public final void A00(C46507Ki6 c46507Ki6) {
        C46513KiC c46513KiC;
        C46506Ki5 A00;
        L38 l38 = this.A00;
        byte[] bArr = this.A02;
        MPT mpt = this.A01;
        try {
            int i = c46507Ki6.A00;
            String str = c46507Ki6.A05;
            synchronized (l38) {
                System.currentTimeMillis();
                LKm lKm = l38.A02;
                synchronized (lKm) {
                    C14360o3.A0B(str, 0);
                    c46513KiC = null;
                    try {
                        try {
                            Map map = (Map) LKm.A01(lKm).get(str);
                            if (map != null) {
                                Iterator A16 = AbstractC166997dE.A16(map);
                                C46513KiC c46513KiC2 = null;
                                while (A16.hasNext()) {
                                    C46513KiC c46513KiC3 = (C46513KiC) A16.next();
                                    if (c46513KiC3.A00() && (c46513KiC2 == null || c46513KiC2.A01 > c46513KiC3.A01)) {
                                        c46513KiC2 = c46513KiC3;
                                    }
                                }
                                c46513KiC = c46513KiC2;
                            }
                        } catch (JSONException unused) {
                            lKm.A04();
                        }
                    } catch (IllegalArgumentException unused2) {
                        lKm.A04();
                    }
                }
                A00 = L38.A00(l38, c46513KiC, bArr, i);
                if (c46513KiC != null) {
                    boolean A002 = c46513KiC.A00();
                    LKm lKm2 = l38.A02;
                    if (A002) {
                        lKm2.A06(Arrays.asList(c46513KiC));
                    } else {
                        lKm2.A05(c46513KiC);
                    }
                }
                System.currentTimeMillis();
            }
            if (A00 != null) {
                mpt.Dpn(A00);
                return;
            }
            int i2 = c46507Ki6.A01;
            L2E l2e = new L2E(l38, mpt, c46507Ki6, bArr);
            System.currentTimeMillis();
            if (i2 <= 0) {
                l2e.A01.onFailure(new Exception(AnonymousClass001.A0O("Invalid number of tokens requested: ", i2)));
                return;
            }
            try {
                InterfaceC50488MQq interfaceC50488MQq = l38.A00;
                ArrayList A17 = AbstractC25225BEi.A17(i2);
                SecureRandom secureRandom = new SecureRandom();
                int curveBytes = interfaceC50488MQq.getCurveBytes();
                int i3 = 0;
                do {
                    byte[] bArr2 = new byte[curveBytes];
                    secureRandom.nextBytes(bArr2);
                    byte[] bArr3 = new byte[curveBytes];
                    byte[] bArr4 = new byte[curveBytes];
                    int blind = interfaceC50488MQq.blind(bArr2, bArr3, bArr4);
                    if (blind == 0) {
                        ?? obj = new Object();
                        obj.A02 = bArr2;
                        obj.A01 = bArr4;
                        obj.A00 = bArr3;
                        A17.add(obj);
                        i3++;
                    } else {
                        throw new Exception(AnonymousClass001.A0O("VOPRF blind(...) returned error code: ", blind));
                    }
                } while (i3 < i2);
                int size = A17.size();
                byte[][] bArr5 = new byte[size];
                for (int i4 = 0; i4 < A17.size(); i4++) {
                    byte[] bArr6 = ((C46500Khz) A17.get(i4)).A00;
                    bArr5[i4] = Arrays.copyOf(bArr6, bArr6.length);
                }
                C47233Ku6 c47233Ku6 = l38.A01;
                L2F l2f = new L2F(l2e, l38, c46507Ki6, A17);
                C47552KzN c47552KzN = c47233Ku6.A00.A03;
                ImmutableList.Builder builder = new ImmutableList.Builder();
                for (int i5 = 0; i5 < size; i5++) {
                    String encodeToString = Base64.encodeToString(bArr5[i5], 8);
                    if (encodeToString != null) {
                        encodeToString = encodeToString.replace("\n", "");
                    }
                    builder.add((Object) encodeToString);
                }
                ImmutableList build = builder.build();
                C14360o3.A0B(build, 1);
                ImmutableList.Builder builder2 = new ImmutableList.Builder();
                C1LC A0I = AbstractC43592JPx.A0I(build);
                while (A0I.hasNext()) {
                    String A1B = AbstractC166987dD.A1B(A0I);
                    C2JO c2jo = new C2JO();
                    c2jo.A09(A1B, "issue_data");
                    builder2.add((Object) c2jo);
                }
                C2JM A0b = AbstractC25225BEi.A0b();
                C2JM A0b2 = AbstractC25225BEi.A0b();
                A0b.A04("projectName", "LS_IgdReceiverFetch");
                C2JO c2jo2 = new C2JO();
                c2jo2.A05("issue_element", builder2.build());
                c2jo2.A08("request_proof", false);
                A0b.A00(c2jo2, DialogModule.KEY_MESSAGE);
                c47552KzN.A00.ATW(new C48146LSv(l2f, 8), new LTC(7, c47552KzN, l2f), new PandoGraphQLRequest(AbstractC25227BEk.A0U(AbstractC43594JPz.A1X(A0b, "configId", c46507Ki6.A05)), "IGDirectACSIssueQuery", A0b.getParamsCopy(), A0b2.getParamsCopy(), C59400Qdx.class, false, null, 0, null, "xfb_messaging_acs_issue", AbstractC166987dD.A1E()), c47552KzN.A01);
            } catch (C105884pz e) {
                l2e.A01.onFailure(e);
            }
        } catch (C105884pz | C46318Keo | IllegalStateException | InvalidKeyException | NoSuchAlgorithmException e2) {
            mpt.onFailure(e2);
        }
    }
}
