package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import java.util.LinkedHashSet;

/* renamed from: X.6l2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C147776l2 implements InterfaceC147786l3 {
    public InterfaceC60442pS A00;
    public C1M1 A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public java.util.Set A06;
    public final InterfaceC11380iw A07;
    public final C18920wW A08;
    public final UserSession A09;

    public C147776l2(InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(interfaceC11380iw, 2);
        this.A09 = userSession;
        this.A07 = interfaceC11380iw;
        this.A08 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
        this.A03 = "0";
        this.A06 = new LinkedHashSet();
        this.A02 = "0";
        this.A04 = "0";
    }

    @Override // X.InterfaceC147786l3
    public final void Cl2(long j, String str, String str2) {
        C14360o3.A0B(str, 1);
        C18920wW c18920wW = this.A08;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, MSV.A00(1264));
        A00.A9K("question_id", Long.valueOf(j));
        A00.AAP("question_source", str);
        A00.AAP("question_text", str2);
        A00.A9K("a_pk", AbstractC003100w.A0k(10, this.A03));
        A00.AAP("m_pk", this.A04);
        A00.A9K(TraceFieldType.BroadcastId, AbstractC003100w.A0k(10, this.A02));
        A00.AAP("container_module", this.A07.getModuleName());
        A00.AAP("view_mode", "viewer");
        A00.AAk("current_guest_ids", AbstractC001800i.A0a(this.A06));
        A00.Cht();
    }

    @Override // X.InterfaceC147786l3
    public final /* synthetic */ void Cl3(long j, String str, String str2) {
    }

    @Override // X.InterfaceC147786l3
    public final void Cl4(int i, String str, String str2, long j) {
        C14360o3.A0B(str, 1);
        C18920wW c18920wW = this.A08;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_live_question_liked");
        A00.AAP("view_mode", "viewer");
        A00.A9K("question_id", Long.valueOf(j));
        A00.AAP("question_source", str);
        A00.AAP("question_text", str2);
        A00.A9K("a_pk", AbstractC003100w.A0k(10, this.A03));
        A00.AAP("m_pk", this.A04);
        A00.A9K("question_index", Long.valueOf(i));
        A00.A9K(TraceFieldType.BroadcastId, AbstractC003100w.A0k(10, this.A02));
        A00.AAP("container_module", this.A07.getModuleName());
        A00.AAk("current_guest_ids", AbstractC001800i.A0a(this.A06));
        A00.Cht();
    }

    @Override // X.InterfaceC147786l3
    public final /* synthetic */ void Cl5(int i, String str, String str2, long j) {
    }

    @Override // X.InterfaceC147786l3
    public final void Cl7(String str) {
        C14360o3.A0B(str, 0);
        C18920wW c18920wW = this.A08;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_live_question_submitted");
        A00.AAP("view_mode", "viewer");
        A00.AAP("question_text", str);
        A00.A9K("a_pk", AbstractC003100w.A0k(10, this.A03));
        A00.A9K(TraceFieldType.BroadcastId, AbstractC003100w.A0k(10, this.A02));
        A00.AAP("container_module", this.A07.getModuleName());
        A00.AAP("m_pk", this.A04);
        A00.AAk("current_guest_ids", AbstractC001800i.A0a(this.A06));
        A00.Cht();
    }

    @Override // X.InterfaceC147786l3
    public final void Cl8(int i, String str, String str2, long j) {
        C14360o3.A0B(str, 1);
        C18920wW c18920wW = this.A08;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_live_question_unliked");
        A00.AAP("view_mode", "viewer");
        A00.A9K("question_id", Long.valueOf(j));
        A00.AAP("question_source", str);
        A00.AAP("question_text", str2);
        A00.A9K("a_pk", AbstractC003100w.A0k(10, this.A03));
        A00.AAP("m_pk", this.A04);
        A00.A9K("question_index", Long.valueOf(i));
        A00.A9K(TraceFieldType.BroadcastId, AbstractC003100w.A0k(10, this.A02));
        A00.AAP("container_module", this.A07.getModuleName());
        A00.AAk("current_guest_ids", AbstractC001800i.A0a(this.A06));
        A00.Cht();
    }

    @Override // X.InterfaceC147786l3
    public final /* synthetic */ void CmA(boolean z) {
    }

    public final void A00(String str, String str2, String str3) {
        Long l;
        C18920wW c18920wW = this.A08;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "live_follow_generated");
        A00.AAK(C4SX.A00(this.A03), "a_pk");
        A00.A9K(TraceFieldType.BroadcastId, Long.valueOf(Long.parseLong(this.A02)));
        A00.AAP("m_pk", this.A04);
        A00.AAP("container_module", this.A07.getModuleName());
        A00.AAP("method", str);
        A00.AAP("view_mode", "viewer");
        if (str3 != null) {
            l = AbstractC003100w.A0k(10, str3);
        } else {
            l = null;
        }
        A00.A9K("c_pk", l);
        A00.A9K("followed_user_id", AbstractC003100w.A0k(10, str2));
        A00.AAk("current_guest_ids", AbstractC001800i.A0a(this.A06));
        A00.Cht();
    }

    @Override // X.InterfaceC147786l3
    public final void CiP() {
        C18920wW c18920wW = this.A08;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_live_ask_question_tapped");
        A00.A9K("a_pk", AbstractC003100w.A0k(10, this.A03));
        A00.A9K(TraceFieldType.BroadcastId, AbstractC003100w.A0k(10, this.A02));
        A00.AAP("container_module", this.A07.getModuleName());
        A00.AAP("m_pk", this.A04);
        A00.AAP("view_mode", "viewer");
        A00.AAk("current_guest_ids", AbstractC001800i.A0a(this.A06));
        A00.Cht();
    }

    @Override // X.InterfaceC147786l3
    public final void Cl6(int i, int i2, int i3, int i4, int i5) {
        C18920wW c18920wW = this.A08;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, MSV.A00(1266));
        A00.A9K(MSV.A00(1525), Long.valueOf(i));
        A00.A9K(MSV.A00(224), Long.valueOf(i2));
        A00.A9K(MSV.A00(1625), Long.valueOf(i3));
        A00.A9K(MSV.A00(915), Long.valueOf(i4));
        A00.A9K(MSV.A00(1682), Long.valueOf(i5));
        A00.A9K("a_pk", AbstractC003100w.A0k(10, this.A03));
        A00.AAP("m_pk", this.A04);
        A00.A9K(TraceFieldType.BroadcastId, AbstractC003100w.A0k(10, this.A02));
        A00.AAP("container_module", this.A07.getModuleName());
        A00.AAP("view_mode", "viewer");
        A00.AAk("current_guest_ids", AbstractC001800i.A0a(this.A06));
        A00.Cht();
    }
}
