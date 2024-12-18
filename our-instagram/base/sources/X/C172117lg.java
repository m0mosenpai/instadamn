package X;

import java.util.List;

/* renamed from: X.7lg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C172117lg {
    public final C172107lf A00;
    public final InterfaceC08830cm A01;
    public final boolean A02;
    public final C3N2 A03;
    public final C0JO A04;
    public final C3N6 A05;

    public final void A00(C129265so c129265so, C5H3 c5h3, A6R a6r, C129165sd c129165sd, Boolean bool) {
        String str;
        Double d;
        Boolean bool2;
        Boolean bool3;
        Long l;
        Long l2;
        Long l3;
        Long l4;
        long j;
        Boolean bool4;
        Boolean bool5;
        Boolean bool6;
        Boolean bool7;
        List list;
        String str2;
        String str3;
        Boolean bool8 = bool;
        C172107lf c172107lf = this.A00;
        boolean z = c129165sd.A02;
        if (c129265so != null) {
            str = c129265so.A01;
        } else {
            str = null;
        }
        C18920wW A00 = C172107lf.A00(c172107lf, str, z);
        if (A00 != null) {
            C25531Mh c25531Mh = new C25531Mh(A00.A00(A00.A00, "gnv_generic_click"), 164);
            if (((AbstractC02600Aj) c25531Mh).A00.isSampled()) {
                C129205si c129205si = a6r.A00;
                if (c129205si != null) {
                    bool2 = c129205si.A05;
                    bool3 = c129205si.A06;
                    l = Long.valueOf(c129205si.A02);
                    l2 = Long.valueOf(c129205si.A03);
                    l3 = Long.valueOf(c129205si.A04);
                    l4 = Long.valueOf(c129205si.A01);
                    d = Double.valueOf(c129205si.A00);
                } else {
                    d = null;
                    bool2 = null;
                    bool3 = null;
                    l = null;
                    l2 = null;
                    l3 = null;
                    l4 = null;
                }
                C5H3 c5h32 = c129165sd.A00;
                long j2 = 0;
                if (c5h3 != null) {
                    j2 = c5h3.BF4();
                    j = c5h3.Bai();
                    bool8 = c5h3.CXP();
                    bool5 = c5h3.CcM();
                    bool4 = Boolean.valueOf(c5h3.Akl());
                    bool6 = Boolean.valueOf(c5h3.AkL());
                    bool7 = Boolean.valueOf(c5h3.Akv());
                    list = c5h3.Bl5();
                } else if (c5h32 != null) {
                    j2 = c5h32.BF4();
                    j = c5h32.Bai();
                    if (bool == null) {
                        bool8 = c5h32.CXP();
                    }
                    bool5 = c5h32.CcM();
                    bool4 = Boolean.valueOf(c5h32.Akl());
                    bool6 = Boolean.valueOf(c5h32.AkL());
                    bool7 = Boolean.valueOf(c5h32.Akv());
                    list = c5h32.Bl5();
                } else {
                    j = 0;
                    bool4 = null;
                    bool5 = null;
                    bool6 = null;
                    bool7 = null;
                    list = null;
                }
                C3N2 c3n2 = this.A03;
                if (c3n2 != null) {
                    str2 = c3n2.CB3(C05F.A0C);
                } else {
                    str2 = null;
                }
                c25531Mh.A0R("purpose", "mutation_2nd_channel");
                c25531Mh.A0R("clicked_target_description", a6r.A01);
                c25531Mh.A0O("clicked_target_is_enabled", bool2);
                c25531Mh.A0O("clicked_target_is_selected", bool3);
                c25531Mh.A0Q("clicked_target_origin_x", l);
                c25531Mh.A0Q("clicked_target_origin_y", l2);
                c25531Mh.A0Q("clicked_target_width", l3);
                c25531Mh.A0Q("clicked_target_height", l4);
                c25531Mh.A0P("clicked_target_alpha", d);
                if (c129265so != null) {
                    str3 = c129265so.A01;
                } else {
                    str3 = null;
                }
                String str4 = "";
                if (str3 == null) {
                    str3 = "";
                }
                c25531Mh.A0m(str3);
                if (c129265so != null) {
                    str4 = c129265so.A00;
                }
                c25531Mh.A0R("module_class", str4);
                c25531Mh.A0Q("content_id", Long.valueOf(j2));
                c25531Mh.A0Q(AbstractC111324zv.A00(843), Long.valueOf(j));
                c25531Mh.A0O("content_is_liked", bool8);
                c25531Mh.A0O("content_is_saved", bool5);
                c25531Mh.A0O("content_can_save", bool4);
                c25531Mh.A0O("content_can_comment", bool6);
                c25531Mh.A0O("content_can_share", bool7);
                c25531Mh.A0S(AbstractC111324zv.A00(2955), list);
                c25531Mh.A0S(AbstractC111324zv.A00(3251), AbstractC37491Gf9.A01(c129165sd.A0G));
                c25531Mh.A0S("tracking_models", AbstractC37491Gf9.A00(c129165sd.A0F));
                c25531Mh.A0S("class_names", c129165sd.A00());
                c25531Mh.A0M(c129165sd.A0B, "gesture_type");
                c25531Mh.A0Q("tap_index", c129165sd.A01);
                c25531Mh.A0Q("gesture_timestamp", Long.valueOf(c129165sd.A07));
                c25531Mh.A0Q("gesture_duration", Long.valueOf(c129165sd.A06));
                c25531Mh.A0P("gesture_coordinate_x", Double.valueOf(c129165sd.A03));
                c25531Mh.A0P("gesture_coordinate_y", Double.valueOf(c129165sd.A04));
                c25531Mh.A0M(c129165sd.A0A, "previous_gesture_type");
                c25531Mh.A0Q("previous_gesture_timestamp", Long.valueOf(c129165sd.A08));
                C3N6 c3n6 = this.A05;
                if (c3n6 != null) {
                    c25531Mh.A0R("correlation_id", c3n6.Ary());
                }
                if (str2 != null) {
                    c25531Mh.A0R("trigger_id", str2);
                }
                if (!this.A02) {
                    c25531Mh.A0t((String) this.A01.get());
                }
                c25531Mh.Cht();
                if (str2 != null && c3n2 != null) {
                    c3n2.Ciu(str2);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01(X.C129165sd r12, X.InterfaceC72563Nd r13, java.util.List r14, double r15, boolean r17) {
        /*
            Method dump skipped, instructions count: 498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C172117lg.A01(X.5sd, X.3Nd, java.util.List, double, boolean):void");
    }

    public C172117lg(C3N2 c3n2, C172107lf c172107lf, C0JO c0jo, C3N6 c3n6, InterfaceC08830cm interfaceC08830cm, boolean z) {
        this.A00 = c172107lf;
        this.A04 = c0jo;
        this.A01 = interfaceC08830cm;
        this.A05 = c3n6;
        this.A03 = c3n2;
        this.A02 = z;
    }
}
