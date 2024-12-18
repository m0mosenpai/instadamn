package X;

/* renamed from: X.24q, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C448624q extends C22F {
    public final void A0R(C22P c22p, String str, String str2) {
        C14360o3.A0B(c22p, 2);
        C25531Mh A0A = C25531Mh.A0A(this.A01);
        if (((AbstractC02600Aj) A0A).A00.isSampled()) {
            A0A.A0M(C81X.A1H, "tool_type");
            A0A.A0s("IG_CAMERA_INVITE_COLLABORATOR_PERSON_ADDED");
            A00(A0A, this);
            A0A.A0R("camera_session_id", str);
            A0A.A0a(A0J());
            A0A.A0M(A0I(), "capture_type");
            A0A.A0b(c22p);
            A0A.A0W(2);
            A0A.A0c(this.A04.A0A);
            A0A.A0m(str2);
            A0A.A0M(EnumC50631MWs.A0L, "surface");
            A0A.A0t(C1QM.A00.A02.A00);
            A0A.Cht();
        }
    }

    public static final void A00(C25531Mh c25531Mh, C448624q c448624q) {
        String str = c448624q.A04.A0L;
        if (str == null) {
            str = "";
        }
        c25531Mh.A0R("camera_session_id", str);
    }
}
