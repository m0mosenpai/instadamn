package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.IMa, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C41211IMa {
    public InterfaceC1118052h A00;
    public InterfaceC1118052h A01;
    public Boolean A02;
    public Boolean A03;
    public Float A04;
    public Integer A05;
    public Integer A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public boolean A0E;
    public final InterfaceC1118152j A0F;

    public final InterfaceC1118152j A00() {
        C1117952g c1117952g;
        Object c52i;
        TreeUpdaterJNI treeUpdaterJNI;
        InterfaceC1118152j interfaceC1118152j = this.A0F;
        if (interfaceC1118152j instanceof HOY) {
            TreeUpdaterJNI treeUpdaterJNI2 = TreeUpdaterJNI.$redex_init_class;
            C09530e4 A1L = AbstractC166987dD.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_ID, this.A07);
            C09530e4 A1L2 = AbstractC166987dD.A1L("image_height", this.A05);
            C09530e4 A1L3 = AbstractC166987dD.A1L("image_width", this.A06);
            C09530e4 A1L4 = AbstractC166987dD.A1L(AbstractC111324zv.A00(1062), Boolean.valueOf(this.A0E));
            C09530e4 A1L5 = AbstractC166987dD.A1L("is_saved", this.A02);
            C09530e4 A1L6 = AbstractC166987dD.A1L("is_trending", this.A03);
            C09530e4 A1L7 = AbstractC166987dD.A1L("media_url", this.A08);
            C09530e4 A1L8 = AbstractC166987dD.A1L("source_media_id", this.A09);
            InterfaceC1118052h interfaceC1118052h = this.A00;
            TreeUpdaterJNI treeUpdaterJNI3 = null;
            if (interfaceC1118052h != null) {
                treeUpdaterJNI = interfaceC1118052h.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            C09530e4 A1L9 = AbstractC166987dD.A1L("source_media_owner", treeUpdaterJNI);
            C09530e4 A1L10 = AbstractC166987dD.A1L("source_media_username", this.A0A);
            InterfaceC1118052h interfaceC1118052h2 = this.A01;
            if (interfaceC1118052h2 != null) {
                treeUpdaterJNI3 = interfaceC1118052h2.F7o();
            }
            c52i = AbstractC37303Gc4.A06(interfaceC1118152j, new C09530e4[]{A1L, A1L2, A1L3, A1L4, A1L5, A1L6, A1L7, A1L8, A1L9, A1L10, AbstractC166987dD.A1L(AbstractC111324zv.A00(1276), treeUpdaterJNI3), AbstractC166987dD.A1L(AbstractC111324zv.A00(1277), this.A0B), AbstractC166987dD.A1L(AbstractC111324zv.A00(531), AbstractC166997dE.A0f(this.A04)), AbstractC166987dD.A1L("sticker_type", this.A0C), AbstractC166987dD.A1L("strong_id__", this.A0D)});
        } else {
            String str = this.A07;
            Integer num = this.A05;
            Integer num2 = this.A06;
            boolean z = this.A0E;
            Boolean bool = this.A02;
            Boolean bool2 = this.A03;
            String str2 = this.A08;
            String str3 = this.A09;
            InterfaceC1118052h interfaceC1118052h3 = this.A00;
            C1117952g c1117952g2 = null;
            if (interfaceC1118052h3 != null) {
                c1117952g = interfaceC1118052h3.Et5();
            } else {
                c1117952g = null;
            }
            String str4 = this.A0A;
            InterfaceC1118052h interfaceC1118052h4 = this.A01;
            if (interfaceC1118052h4 != null) {
                c1117952g2 = interfaceC1118052h4.Et5();
            }
            c52i = new C52i(c1117952g, c1117952g2, bool, bool2, this.A04, num, num2, str, str2, str3, str4, this.A0B, this.A0C, this.A0D, z);
        }
        return (InterfaceC1118152j) c52i;
    }

    public C41211IMa(InterfaceC1118152j interfaceC1118152j) {
        this.A0F = interfaceC1118152j;
        this.A07 = interfaceC1118152j.getId();
        this.A05 = interfaceC1118152j.BGg();
        this.A06 = interfaceC1118152j.BGz();
        this.A0E = interfaceC1118152j.CcL();
        this.A02 = interfaceC1118152j.CcM();
        this.A03 = interfaceC1118152j.Cep();
        this.A08 = interfaceC1118152j.BS0();
        this.A09 = interfaceC1118152j.Byk();
        this.A00 = interfaceC1118152j.Bym();
        this.A0A = interfaceC1118152j.Byp();
        this.A01 = interfaceC1118152j.C0V();
        this.A0B = interfaceC1118152j.C0W();
        this.A04 = interfaceC1118152j.C0Z();
        this.A0C = interfaceC1118152j.C0o();
        this.A0D = interfaceC1118152j.getStrongId();
    }
}
