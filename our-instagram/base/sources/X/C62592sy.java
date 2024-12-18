package X;

import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.2sy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C62592sy implements InterfaceC62602sz, InterfaceC62612t0 {
    public C65192xH A00;
    public final UserSession A01;
    public final C61842rl A02;
    public final C61842rl A03;

    public C62592sy(UserSession userSession, C61842rl c61842rl, C61842rl c61842rl2) {
        C14360o3.A0B(c61842rl, 1);
        C14360o3.A0B(c61842rl2, 2);
        this.A03 = c61842rl;
        this.A02 = c61842rl2;
        this.A01 = userSession;
    }

    @Override // X.InterfaceC62602sz
    public final void Chd() {
        AbstractC72153Lo.A00 = false;
        A00();
    }

    private final void A00() {
        int i;
        String join;
        C65192xH c65192xH = this.A00;
        if (c65192xH != null) {
            HashMap hashMap = new HashMap();
            String str = ((C65312xT) ((AbstractC65202xI) c65192xH).A00).A01;
            if (str == null) {
                C61842rl c61842rl = this.A02;
                if ((!c61842rl.A0h.A04.isEmpty()) && IB7.A00(this.A01).longValue() > 0) {
                    c61842rl.A09(C05F.A15);
                    return;
                }
            }
            C65192xH c65192xH2 = this.A00;
            if (c65192xH2 != null) {
                if (this.A02.A0h.A01) {
                    ArrayList A06 = c65192xH2.A06();
                    if (A06.isEmpty()) {
                        join = "";
                    } else {
                        join = TextUtils.join(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, A06);
                        C14360o3.A07(join);
                    }
                    hashMap.put("cached_feed_item_ids", join);
                }
                if (str != null) {
                    hashMap.put("pagination_source", str);
                }
                C65192xH c65192xH3 = this.A00;
                if (c65192xH3 != null) {
                    String str2 = ((C65312xT) ((AbstractC65202xI) c65192xH3).A00).A01;
                    if (str2 != null && str2.equals("feed_recs")) {
                        List A07 = c65192xH3.A07();
                        if (A07.isEmpty()) {
                            C0w9.A01.EmN("FeedRecsPaginationUtil", "invalid params when generating pagination params");
                        }
                        int i2 = 0;
                        while (true) {
                            if (i2 >= A07.size() - 1) {
                                break;
                            }
                            C1XV c1xv = ((C3XG) A07.get(i2)).A06;
                            i2++;
                            if (c1xv == C1XV.A0O) {
                                if (i2 != -1) {
                                    StringWriter stringWriter = new StringWriter();
                                    try {
                                        C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
                                        A0A.A0d();
                                        A0A.A0Q("total_num_items", A07.size() - i2);
                                        int size = A07.size();
                                        while (true) {
                                            size--;
                                            if (size < i2) {
                                                break;
                                            }
                                            if (((C3XG) A07.get(size)).A05.CCj() != C05F.A01) {
                                                if (size != -1) {
                                                    C3XG c3xg = (C3XG) A07.get(size);
                                                    int i3 = size - i2;
                                                    if (c3xg != null) {
                                                        A0A.A0r("last_non_organic_item");
                                                        A0A.A0d();
                                                        A0A.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_ID, c3xg.A09);
                                                        switch (c3xg.A05.CCj().intValue()) {
                                                            case 1:
                                                                i = 1;
                                                                break;
                                                            case 2:
                                                                i = 2;
                                                                break;
                                                            case 3:
                                                                i = 3;
                                                                break;
                                                            case 4:
                                                                i = 4;
                                                                break;
                                                            default:
                                                                i = 0;
                                                                break;
                                                        }
                                                        A0A.A0Q(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, i);
                                                        A0A.A0Q("index", i3);
                                                        A0A.A0a();
                                                    }
                                                }
                                            }
                                        }
                                        int size2 = A07.size();
                                        while (true) {
                                            size2--;
                                            if (size2 >= i2) {
                                                C3XG c3xg2 = (C3XG) A07.get(size2);
                                                if ((c3xg2.A05 instanceof InterfaceC38371qR) && c3xg2.A05.CCj() == C05F.A01) {
                                                    if (size2 != -1) {
                                                        C3XG c3xg3 = (C3XG) A07.get(size2);
                                                        int i4 = size2 - i2;
                                                        if (c3xg3 != null) {
                                                            A0A.A0r("last_organic_item");
                                                            A0A.A0d();
                                                            InterfaceC38381qS interfaceC38381qS = c3xg3.A05;
                                                            C14360o3.A0C(interfaceC38381qS, "null cannot be cast to non-null type com.instagram.feed.media.ModelWithMedia");
                                                            A0A.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_ID, ((InterfaceC38371qR) interfaceC38381qS).BQN().getId());
                                                            A0A.A0Q("index", i4);
                                                            A0A.A0a();
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        A0A.A0a();
                                        A0A.close();
                                        hashMap.put("recs_paging_token", stringWriter.toString());
                                    } catch (IOException e) {
                                        C0K8.A0F("FeedRecsPaginationUtil", AbstractC111324zv.A00(1612), e);
                                    }
                                }
                            }
                        }
                    }
                    C61842rl c61842rl2 = this.A03;
                    C1EN c1en = C1EN.A0H;
                    synchronized (((C65312xT) ((AbstractC65202xI) c65192xH).A00).A03) {
                    }
                    c61842rl2.A0A(c1en, null, hashMap);
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final boolean A01() {
        EnumC74483Wg enumC74483Wg = C61922rt.A01(this.A03.A0e).A01;
        if (enumC74483Wg != null && enumC74483Wg != EnumC74483Wg.A04) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004c, code lost:
    
        if ((java.lang.System.currentTimeMillis() - r2.longValue()) > java.util.concurrent.TimeUnit.SECONDS.toMillis(r8)) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0068, code lost:
    
        if (X.C3ZD.A00 == null) goto L31;
     */
    @Override // X.InterfaceC62612t0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AD4() {
        /*
            r9 = this;
            X.2xH r4 = r9.A00
            if (r4 == 0) goto L92
            X.2rl r5 = r9.A03
            com.instagram.common.session.UserSession r1 = r9.A01
            X.0Tz r0 = X.C06090Tz.A05
            r2 = 36610760792611018(0x82114b000018ca, double:3.2161307727236354E-306)
            long r2 = X.C18U.A01(r0, r1, r2)
            int r6 = (int) r2
            r2 = 36610760792676555(0x82114b000118cb, double:3.216130772765081E-306)
            long r2 = X.C18U.A01(r0, r1, r2)
            int r8 = (int) r2
            X.2rt r0 = r5.A0e
            X.3Hr r5 = X.C61922rt.A01(r0)
            X.3Wg r3 = r5.A01
            X.3Wg r0 = X.EnumC74483Wg.A03
            if (r3 == r0) goto L4e
            if (r6 <= 0) goto L6a
            if (r8 <= 0) goto L6a
            java.lang.Long r2 = r5.A02
            X.3Wg r0 = X.EnumC74483Wg.A05
            if (r3 != r0) goto L6a
            int r0 = r5.A00
            if (r0 >= r6) goto L6a
            if (r2 == 0) goto L6a
            long r6 = java.lang.System.currentTimeMillis()
            long r2 = r2.longValue()
            long r6 = r6 - r2
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            long r2 = (long) r8
            long r2 = r0.toMillis(r2)
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 <= 0) goto L6a
        L4e:
            java.lang.String r0 = r5.A03
            boolean r0 = X.AbstractC13670mt.A0B(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L6a
            boolean r0 = r5.A04
            if (r0 == 0) goto L6a
            boolean r0 = r9.A01()
            if (r0 != 0) goto L6a
            X.2xH r0 = r9.A00
            if (r0 == 0) goto L6a
            X.MUW r0 = X.C3ZD.A00
            if (r0 == 0) goto L8e
        L6a:
            X.2xW r0 = r4.A00
            X.2xT r0 = (X.C65312xT) r0
            java.lang.String r0 = r0.A01
            if (r0 != 0) goto L91
            X.2rl r0 = r9.A02
            X.2rq r0 = r0.A0h
            java.util.List r0 = r0.A04
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L91
            java.lang.Long r0 = X.IB7.A00(r1)
            long r3 = r0.longValue()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L91
        L8e:
            r9.A00()
        L91:
            return
        L92:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62592sy.AD4():void");
    }

    @Override // X.InterfaceC62602sz
    public final boolean CL7() {
        if (this.A00 != null) {
            return !((AbstractC65332xV) ((AbstractC65202xI) r0).A00).A01.isEmpty();
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // X.InterfaceC62602sz
    public final boolean CLJ() {
        return !AbstractC13670mt.A0B(C61922rt.A01(this.A03.A0e).A03);
    }

    @Override // X.InterfaceC62602sz
    public final boolean CUG() {
        if (C61922rt.A01(this.A03.A0e).A01 != EnumC74483Wg.A05) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC62602sz
    public final boolean CXf() {
        C65192xH c65192xH = this.A00;
        if (c65192xH != null) {
            if (!c65192xH.A0F() && CL7() && this.A00 != null && C3ZD.A00 == null) {
                return true;
            }
            return false;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // X.InterfaceC62602sz
    public final boolean isLoading() {
        if (C18U.A06(C06090Tz.A05, this.A01, 36317594919048595L)) {
            EnumC74483Wg enumC74483Wg = C61922rt.A01(this.A03.A0e).A01;
            if (!A01()) {
                if (CLJ() && enumC74483Wg != EnumC74483Wg.A05) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return A01();
    }
}
