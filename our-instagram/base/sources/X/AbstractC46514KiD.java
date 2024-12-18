package X;

/* renamed from: X.KiD, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46514KiD {
    public final void A00(long j, String str, boolean z) {
        boolean A1a = AbstractC31175DnJ.A1a(str);
        C0Zx c0Zx = new C0Zx();
        c0Zx.A03("is_screen_query_editor", Boolean.valueOf(z));
        c0Zx.A03("was_editor_fully_loaded", Boolean.valueOf(A1a));
        c0Zx.A05("time_spent", Long.valueOf(j));
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f((C18920wW) ((C44915JuT) this).A00, "avatars_core_experience_editor_native_exit");
        if (A0f.isSampled()) {
            AbstractC43593JPy.A1G(A0f, c0Zx, str);
            A0f.AAP("product", "editor");
            A0f.A8I("client_timestamp_ms", Double.valueOf(r2.A01.now()));
            A0f.Cht();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x009c, code lost:
    
        if (r7.equals(r1) != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c7, code lost:
    
        if (r6.equals(r1) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00da, code lost:
    
        if (r10.equals(r1) != false) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01(java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, boolean r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC46514KiD.A01(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean):void");
    }
}
