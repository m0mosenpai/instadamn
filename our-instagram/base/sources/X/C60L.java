package X;

/* renamed from: X.60L, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C60L {
    public InterfaceC02550Ad A00;

    public final void A00(String str, String str2, String str3, String str4, String str5, int i) {
        InterfaceC02550Ad interfaceC02550Ad = this.A00;
        if (interfaceC02550Ad != null) {
            C25531Mh A0K = C25531Mh.A0K(interfaceC02550Ad);
            String A00 = AbstractC43595JQa.A00(i);
            if (((AbstractC02600Aj) A0K).A00.isSampled()) {
                A0K.A0R("notif_id", str);
                A0K.A0R("message_id", str2);
                A0K.A0R("notif_event", A00);
                A0K.A0R("carrier", null);
                A0K.A0R("channel", str4);
                A0K.A0R("notif_type", str3);
                A0K.A0R("extra_info", str5);
                A0K.Cht();
                return;
            }
            return;
        }
        C14360o3.A0F("logger");
        throw C00O.createAndThrow();
    }
}
