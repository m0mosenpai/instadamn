package X;

/* renamed from: X.8dB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C191138dB {
    public final C18920wW A00;

    public final void A03(int i) {
        long j = i;
        Long valueOf = Long.valueOf(j);
        if (j > 0) {
            C18920wW c18920wW = this.A00;
            InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_received_quicksnap_impression");
            if (A00.isSampled()) {
                A00.A9K("number_of_quicksnaps", valueOf);
                A00.AAP("canonical_nav_chain", AbstractC25041Ki.A00);
                A00.Cht();
            }
        }
    }

    public static final void A00(EnumC53366NjH enumC53366NjH, C191138dB c191138dB, String str) {
        Long l;
        C18920wW c18920wW = c191138dB.A00;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_quicksnap_archive");
        if (A00.isSampled()) {
            A00.A8R(enumC53366NjH, "action_name");
            if (str != null) {
                l = AbstractC003100w.A0k(10, str);
            } else {
                l = null;
            }
            A00.A9K("media_id", l);
            A00.AAP("canonical_nav_chain", AbstractC25041Ki.A00);
            A00.Cht();
        }
    }

    public static final void A01(EnumC223409tX enumC223409tX, C191138dB c191138dB, String str) {
        Long l;
        C18920wW c18920wW = c191138dB.A00;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_quicksnap_creation");
        if (A00.isSampled()) {
            A00.A8R(enumC223409tX, "action_name");
            if (str != null) {
                l = AbstractC003100w.A0k(10, str);
            } else {
                l = null;
            }
            A00.A9K("media_id", l);
            A00.AAP("canonical_nav_chain", AbstractC25041Ki.A00);
            A00.Cht();
        }
    }

    public static final void A02(EnumC46286KeI enumC46286KeI, C191138dB c191138dB, String str) {
        Long l;
        C18920wW c18920wW = c191138dB.A00;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_quicksnap_interaction");
        if (A00.isSampled()) {
            A00.A8R(enumC46286KeI, "action_name");
            if (str != null) {
                l = AbstractC003100w.A0k(10, str);
            } else {
                l = null;
            }
            A00.A9K("media_id", l);
            A00.AAP("canonical_nav_chain", AbstractC25041Ki.A00);
            A00.Cht();
        }
    }

    public C191138dB(C18920wW c18920wW) {
        this.A00 = c18920wW;
    }
}
