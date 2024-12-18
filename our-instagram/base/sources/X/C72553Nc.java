package X;

import java.util.regex.Pattern;

/* renamed from: X.3Nc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C72553Nc implements InterfaceC72563Nd {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C19280xC A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;

    @Override // X.InterfaceC72563Nd
    public final String Byq() {
        return "";
    }

    public C72553Nc(C19280xC c19280xC, String str, String str2, String str3, String str4, long j) {
        this.A00 = j;
        this.A01 = c19280xC;
        this.A05 = str;
        this.A03 = str2;
        this.A02 = str3;
        this.A04 = str4;
    }

    @Override // X.InterfaceC72563Nd
    public final String Awu() {
        String str = this.A02;
        Pattern pattern = AbstractC13670mt.A03;
        if (str == null) {
            return "";
        }
        return str;
    }

    @Override // X.InterfaceC72563Nd
    public final String Awv() {
        String str = this.A03;
        Pattern pattern = AbstractC13670mt.A03;
        if (str == null) {
            return "";
        }
        return str;
    }

    @Override // X.InterfaceC72563Nd
    public final String Aww() {
        String str = this.A04;
        Pattern pattern = AbstractC13670mt.A03;
        if (str == null) {
            return "";
        }
        return str;
    }

    @Override // X.InterfaceC72563Nd
    public final String Byr() {
        String str = this.A05;
        Pattern pattern = AbstractC13670mt.A03;
        if (str == null) {
            return "";
        }
        return str;
    }
}
