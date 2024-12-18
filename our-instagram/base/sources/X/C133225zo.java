package X;

import android.content.Context;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mci.NotificationCenter;
import com.google.common.util.concurrent.ListenableFuture;
import com.instagram.common.session.UserSession;
import com.meta.foa.instagram.performancelogging.messagingready.IGFOAMessagingReadyLogger;
import java.util.HashSet;

/* renamed from: X.5zo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C133225zo {
    public final long A00;
    public final C42201xA A01;
    public final C42201xA A02;
    public final C41761wQ A03;
    public final UserSession A04;
    public final C6AI A05;
    public final C2FQ A06;
    public final IGFOAMessagingReadyLogger A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;

    public C133225zo(final C42221xC c42221xC, C41761wQ c41761wQ, UserSession userSession, final C135816Cj c135816Cj, final C133215zn c133215zn, C6AI c6ai, C2FQ c2fq, IGFOAMessagingReadyLogger iGFOAMessagingReadyLogger, String str, String str2, String str3, String str4, long j) {
        C14360o3.A0B(c2fq, 1);
        C14360o3.A0B(c42221xC, 4);
        C14360o3.A0B(str2, 9);
        C14360o3.A0B(str4, 13);
        this.A06 = c2fq;
        this.A07 = iGFOAMessagingReadyLogger;
        this.A03 = c41761wQ;
        this.A09 = str;
        this.A05 = c6ai;
        this.A0B = str2;
        this.A00 = j;
        this.A0A = str3;
        this.A04 = userSession;
        this.A08 = str4;
        C42201xA A00 = AbstractC42021ws.A00();
        this.A01 = A00;
        this.A02 = AbstractC42021ws.A00();
        c41761wQ.A02(c42221xC, new InterfaceC42241xE() { // from class: X.5zp
            /* JADX WARN: Type inference failed for: r7v0, types: [com.facebook.msys.mca.MailboxFeature, X.5zr, java.lang.Object] */
            @Override // X.InterfaceC42241xE
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                final InterfaceC135846Cm interfaceC135846Cm = (InterfaceC135846Cm) obj;
                C14360o3.A0B(interfaceC135846Cm, 0);
                final C133225zo c133225zo = this;
                ?? mailboxFeature = new MailboxFeature(interfaceC135846Cm);
                final C133215zn c133215zn2 = c133215zn;
                ListenableFuture A002 = AbstractC133285zv.A00(mailboxFeature.A01(null, c133225zo.A0B, c133225zo.A0A, c133225zo.A00));
                C1M8 c1m8 = C1M8.A01;
                C9FO c9fo = new C9FO(9, c133225zo, c133215zn2, mailboxFeature);
                C14360o3.A0B(A002, 0);
                AnonymousClass600 A01 = AbstractRunnableC133325zz.A01(new AnonymousClass604(new C9FO(10, c133225zo, c133215zn2, mailboxFeature)), AbstractRunnableC133325zz.A01(new C133305zx(new C50367MLu(c9fo, 22)), A002, c1m8), c1m8);
                final C135816Cj c135816Cj2 = c135816Cj;
                C2OD.A03(new C2JL() { // from class: X.605
                    @Override // X.C2JL
                    public final void onFailure(Throwable th) {
                        C14360o3.A0B(th, 0);
                        C0K8.A0F("RxAdvancedCryptoTransportV2", "Cannot initialize ACT due to failure on upserting current user: %s", th);
                        c133225zo.A06.A05("fail_upserting_current_user");
                        C0w9.A07("RxAdvancedCryptoTransportV2", th);
                    }

                    /* JADX WARN: Type inference failed for: r4v0, types: [X.5mW, com.facebook.msys.mca.MailboxFeature] */
                    @Override // X.C2JL
                    public final /* bridge */ /* synthetic */ void onSuccess(Object obj2) {
                        C133225zo c133225zo2 = c133225zo;
                        C2FQ c2fq2 = c133225zo2.A06;
                        c2fq2.A04("create_act_connection_params_start");
                        C42201xA c42201xA = c133225zo2.A01;
                        NotificationCenter A003 = C136066Dl.A00();
                        c42201xA.accept(new C125835mY(new MailboxFeature(interfaceC135846Cm), A003, c135816Cj2, c133215zn2, c133225zo2.A05, c133225zo2.A09, c133225zo2.A0B));
                        c2fq2.A04("create_act_connection_params_end");
                    }
                }, A01, c1m8);
            }
        });
        c41761wQ.A02(A00, new InterfaceC42241xE() { // from class: X.606
            @Override // X.InterfaceC42241xE
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                int i;
                final C133225zo c133225zo = C133225zo.this;
                AbstractC09800fd.A01("RxAdvancedCryptoTransportV2.maybeCreateACTAndLogin", -1675969581);
                try {
                    C6AI c6ai2 = c133225zo.A05;
                    int i2 = 1;
                    if (c6ai2.A01 != 1 && c133225zo.A02.A0W() == null) {
                        C125835mY c125835mY = (C125835mY) c133225zo.A01.A0W();
                        if (c125835mY == null) {
                            i = 2120869171;
                        } else {
                            C2FQ c2fq2 = c133225zo.A06;
                            c2fq2.A04("create_act_param_start");
                            if (!AbstractC94034Kn.A00(c133225zo.A04)) {
                                i2 = 2;
                            } else {
                                long j2 = AbstractC125845mZ.A00;
                                if (j2 == -1 || j2 == c133225zo.A00) {
                                    String str5 = c133225zo.A08;
                                    if (C14360o3.A0K(str5, "NOTIFICATION")) {
                                        i2 = 4;
                                    } else if (C14360o3.A0K(str5, "NOTIFICATION_RETRY")) {
                                        i2 = 5;
                                    } else {
                                        i2 = 0;
                                        if (C14360o3.A0K(str5, "periodic_sync")) {
                                            i2 = 3;
                                        }
                                    }
                                }
                                AbstractC125845mZ.A00 = c133225zo.A00;
                            }
                            C6CN c6cn = c125835mY.A02.A01.A00;
                            C1334860s c1334860s = c6cn.A01;
                            String str6 = (String) c1334860s.A05.get();
                            boolean z = false;
                            if (str6 != null) {
                                C14360o3.A0B("/", 1);
                                if (str6.endsWith("/")) {
                                    str6 = str6.substring(0, str6.length() - 1);
                                    C14360o3.A07(str6);
                                }
                            }
                            C133215zn c133215zn2 = c125835mY.A03;
                            if (c133215zn2.A05 && C0JA.A00().A04()) {
                                z = true;
                            }
                            c6cn.A03.getFacebookUserID();
                            String str7 = str6;
                            int i3 = i2;
                            String str8 = str6;
                            C125855ma c125855ma = new C125855ma(str8, str7, i3, c133215zn2.A01, c133215zn2.A02, c133215zn2.A08, z, c133215zn2.A07);
                            Context context = c1334860s.A01;
                            final C125875mc c125875mc = new C125875mc(context, new C125865mb(AbstractC12880la.A04(context)), c125855ma, c125835mY.A00, c6cn.A02, c125835mY.A01, c125835mY.A04, c125835mY.A05, c125835mY.A06);
                            HashSet hashSet = new HashSet();
                            if (c133215zn2.A03) {
                                hashSet.add(4);
                            }
                            c125875mc.A01 = hashSet;
                            c2fq2.A04("create_act_param_end");
                            C2FQ c2fq3 = c6ai2.A0G;
                            if (c2fq3 != null) {
                                c2fq3.A02.markerPoint(c2fq3.A01, c2fq3.A00, "act_login_start");
                            }
                            IGFOAMessagingReadyLogger iGFOAMessagingReadyLogger2 = c6ai2.A0H;
                            if (iGFOAMessagingReadyLogger2 != null) {
                                iGFOAMessagingReadyLogger2.onLogActLoginStart();
                            }
                            c6ai2.A01 = 1;
                            System.currentTimeMillis();
                            c6ai2.A0D.accept(1);
                            C2OD.A03(new C2JL() { // from class: X.64L
                                @Override // X.C2JL
                                public final void onFailure(Throwable th) {
                                    C14360o3.A0B(th, 0);
                                    C133225zo c133225zo2 = c133225zo;
                                    C2FQ c2fq4 = c133225zo2.A06;
                                    String message = th.getMessage();
                                    String str9 = "";
                                    if (message == null) {
                                        message = "";
                                    }
                                    c2fq4.A06("login_result", message);
                                    IGFOAMessagingReadyLogger iGFOAMessagingReadyLogger3 = c133225zo2.A07;
                                    if (iGFOAMessagingReadyLogger3 != null) {
                                        String message2 = th.getMessage();
                                        if (message2 != null) {
                                            str9 = message2;
                                        }
                                        iGFOAMessagingReadyLogger3.annotateLoginResult(str9);
                                    }
                                    C6AI c6ai3 = c133225zo2.A05;
                                    c6ai3.A01();
                                    String message3 = th.getMessage();
                                    if (message3 == null) {
                                        message3 = "login failure";
                                    }
                                    c6ai3.A0C.accept(message3);
                                    C0K8.A0O("RxAdvancedCryptoTransportV2", "Failure on getting login result: %s", th.getMessage());
                                }

                                @Override // X.C2JL
                                public final /* bridge */ /* synthetic */ void onSuccess(Object obj2) {
                                    String str9;
                                    String obj3;
                                    C64K c64k = (C64K) obj2;
                                    C133225zo c133225zo2 = c133225zo;
                                    C2FQ c2fq4 = c133225zo2.A06;
                                    String str10 = "";
                                    if (c64k == null || (str9 = c64k.toString()) == null) {
                                        str9 = "";
                                    }
                                    c2fq4.A06("login_result", str9);
                                    IGFOAMessagingReadyLogger iGFOAMessagingReadyLogger3 = c133225zo2.A07;
                                    if (iGFOAMessagingReadyLogger3 != null) {
                                        if (c64k != null && (obj3 = c64k.toString()) != null) {
                                            str10 = obj3;
                                        }
                                        iGFOAMessagingReadyLogger3.annotateLoginResult(str10);
                                    }
                                    if (c64k == null) {
                                        C6AI c6ai3 = c133225zo2.A05;
                                        c6ai3.A01();
                                        c6ai3.A0C.accept("login result null");
                                    } else {
                                        C6AI c6ai4 = c133225zo2.A05;
                                        String obj4 = c64k.toString();
                                        C14360o3.A0B(obj4, 0);
                                        c6ai4.A0C.accept(obj4);
                                        if (c64k.equals(C64K.A05)) {
                                            return;
                                        }
                                        Integer num = c64k.A00;
                                        if (num == C05F.A0Y || (num == C05F.A0j && c64k.A01 == C05F.A00)) {
                                            c6ai4.A01 = 2;
                                            C2FQ c2fq5 = c6ai4.A0G;
                                            if (c2fq5 != null) {
                                                c2fq5.A02.markerPoint(c2fq5.A01, c2fq5.A00, "act_login_end");
                                            }
                                            IGFOAMessagingReadyLogger iGFOAMessagingReadyLogger4 = c6ai4.A0H;
                                            if (iGFOAMessagingReadyLogger4 != null) {
                                                iGFOAMessagingReadyLogger4.onLogActLoginEnd();
                                            }
                                            c6ai4.A0D.accept(Integer.valueOf(c6ai4.A01));
                                            c6ai4.A0A.set(true);
                                        } else {
                                            c6ai4.A01();
                                        }
                                    }
                                    c133225zo2.A02.accept(c125875mc);
                                }
                            }, c125875mc.A02(), C1M8.A01);
                            i = 1338834950;
                        }
                    } else {
                        i = 1456467361;
                    }
                    AbstractC09800fd.A00(i);
                } catch (Throwable th) {
                    AbstractC09800fd.A00(-929923088);
                    throw th;
                }
            }
        });
        final Integer[] numArr = c6ai.A0I;
        c41761wQ.A02(c42221xC.A0D(), new InterfaceC42241xE() { // from class: X.608
            @Override // X.InterfaceC42241xE
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                if (((Boolean) obj).booleanValue()) {
                    numArr[0] = 99;
                    return;
                }
                C41761wQ c41761wQ2 = this.A03;
                C42221xC c42221xC2 = c42221xC;
                final Integer[] numArr2 = numArr;
                c41761wQ2.A02(c42221xC2, new InterfaceC42241xE() { // from class: X.60A
                    @Override // X.InterfaceC42241xE
                    public final /* bridge */ /* synthetic */ void accept(Object obj2) {
                        numArr2[0] = 1;
                    }
                });
            }
        });
        numArr[1] = 1;
        numArr[2] = 1;
        numArr[3] = 1;
        numArr[4] = 1;
    }
}
