package X;

import android.os.SystemClock;
import android.text.TextUtils;
import java.io.IOException;

/* loaded from: classes10.dex */
public final class TRP implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C62830STc A01;
    public final /* synthetic */ C63364SiN A02;
    public final /* synthetic */ InterfaceC65498TlM A03;
    public final /* synthetic */ Integer A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ byte[] A06;

    public TRP(C62830STc c62830STc, C63364SiN c63364SiN, InterfaceC65498TlM interfaceC65498TlM, Integer num, String str, byte[] bArr, int i) {
        this.A02 = c63364SiN;
        this.A05 = str;
        this.A06 = bArr;
        this.A04 = num;
        this.A00 = i;
        this.A03 = interfaceC65498TlM;
        this.A01 = c62830STc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        int indexOf;
        String substring;
        C63364SiN c63364SiN = this.A02;
        String str2 = this.A05;
        byte[] bArr = this.A06;
        int A03 = AbstractC50522MSa.A03(this.A04.intValue());
        int i = this.A00;
        InterfaceC65498TlM interfaceC65498TlM = this.A03;
        try {
            C63364SiN.A02(c63364SiN);
            if (c63364SiN.A0Y == C05F.A0C) {
                str = "";
                String str3 = "";
                if (str2.contains("|")) {
                    indexOf = str2.indexOf("|");
                } else {
                    indexOf = str2.indexOf("#");
                }
                if (indexOf >= 0) {
                    if (indexOf != 0) {
                        str2.substring(0, indexOf);
                    }
                    String substring2 = str2.substring(indexOf);
                    if (substring2.startsWith("|")) {
                        int length = substring2.length();
                        if (length == 12) {
                            String substring3 = substring2.substring(1);
                            if (!TextUtils.isEmpty(substring3) && substring3.length() == 11) {
                                str = substring3;
                            }
                        } else if (length == 23) {
                            String substring4 = substring2.substring(1, 12);
                            if (!TextUtils.isEmpty(substring4) && substring4.length() == 11) {
                                str = substring4;
                            }
                            substring = substring2.substring(12);
                            TextUtils.isEmpty(substring);
                        }
                    }
                    if (substring2.startsWith("#")) {
                        int length2 = substring2.length();
                        if (length2 == 23) {
                            String substring5 = substring2.substring(1);
                            if (!TextUtils.isEmpty(substring5) && !substring5.startsWith("#") && substring5.length() == 22) {
                                str3 = substring5;
                            }
                        } else if (length2 == 45) {
                            String substring6 = substring2.substring(1, 23);
                            if (!TextUtils.isEmpty(substring6) && !substring6.startsWith("#") && substring6.length() == 22) {
                                str3 = substring6;
                            }
                            String substring7 = substring2.substring(23, 34);
                            if (!TextUtils.isEmpty(substring7) && substring7.length() == 11) {
                                str = substring7;
                            }
                            substring = substring2.substring(34);
                            TextUtils.isEmpty(substring);
                        }
                    }
                }
                if (!TextUtils.isEmpty(str3)) {
                    str = AnonymousClass001.A0R("#", str3);
                }
                try {
                    TextUtils.isEmpty(str);
                    C63293Sgt c63293Sgt = c63364SiN.A0E;
                    synchronized (c63293Sgt) {
                        Integer num = (Integer) AbstractC62857SUe.A01.get(str2);
                        if (num != null) {
                            str2 = num.toString();
                        } else {
                            SOJ soj = c63293Sgt.A0I;
                            String.format(null, "Failed to encode topic %s", str2);
                            soj.A02(null);
                        }
                        try {
                            C63293Sgt.A02(c63293Sgt, new C62671SLj(new C63146Sds(EnumC61172RgY.PUBLISH, A03), new SLF(str2, i), bArr), c63293Sgt.A01);
                        } catch (IOException e) {
                            throw e;
                        }
                    }
                    C62488SDp c62488SDp = c63364SiN.A0X;
                    if (c62488SDp != null) {
                        c62488SDp.A01.A05.post(new TL1(c62488SDp));
                    }
                    if (interfaceC65498TlM != null) {
                        interfaceC65498TlM.Dpi(SystemClock.elapsedRealtime());
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    th = th;
                    RhR A00 = RhR.A00(th);
                    C63364SiN.A03(c63364SiN, EnumC61139Rft.PUBLISH, A00, th);
                    if (interfaceC65498TlM != null) {
                        Integer A002 = AbstractC62804SRy.A00(A00.name());
                        TextUtils.isEmpty(str);
                        interfaceC65498TlM.DG6(A002);
                    }
                    th.getMessage();
                    return;
                }
            }
            if (interfaceC65498TlM != null) {
                interfaceC65498TlM.DG6(C05F.A15);
            }
        } catch (Throwable th2) {
            th = th2;
            str = null;
        }
    }
}
