package X;

import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Min, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51144Min extends C2UU {
    public List A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;

    @Override // X.C2UU
    public final void onBindViewHolder(C3OO c3oo, int i) {
        C14360o3.A0B(c3oo, 0);
        CAY cay = EnumC53236NgZ.values()[getItemViewType(i)].A00;
        List list = this.A00;
        cay.A01(c3oo, this.A01, this.A02, list, i);
    }

    @Override // X.C2UU
    public final C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        C14360o3.A0B(viewGroup, 0);
        return EnumC53236NgZ.values()[i].A00.A00(viewGroup);
    }

    public C51144Min(InterfaceC11380iw interfaceC11380iw, UserSession userSession, List list) {
        AbstractC167017dG.A1P(list, userSession);
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
        this.A00 = list;
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(385662323);
        int size = this.A00.size();
        C0f9.A0A(1151882426, A03);
        return size;
    }

    @Override // X.C2UU, android.widget.Adapter
    public final int getItemViewType(int i) {
        EnumC53236NgZ enumC53236NgZ;
        int A03 = C0f9.A03(908436402);
        Object obj = this.A00.get(i);
        C14360o3.A0B(obj, 0);
        if (MUD.A00(obj, 20)) {
            enumC53236NgZ = EnumC53236NgZ.A03;
        } else if (C51760Mtj.A04(obj, 21)) {
            enumC53236NgZ = EnumC53236NgZ.A09;
        } else if (MUD.A00(obj, 21)) {
            enumC53236NgZ = EnumC53236NgZ.A04;
        } else if (C51746MtV.A00(obj, 2)) {
            enumC53236NgZ = EnumC53236NgZ.A06;
        } else if (C51746MtV.A00(obj, 4)) {
            enumC53236NgZ = EnumC53236NgZ.A08;
        } else if (C51746MtV.A00(obj, 3)) {
            enumC53236NgZ = EnumC53236NgZ.A07;
        } else if (obj instanceof C27834COx) {
            enumC53236NgZ = EnumC53236NgZ.A05;
        } else {
            throw AbstractC166987dD.A12("Unsupported item type");
        }
        int ordinal = enumC53236NgZ.ordinal();
        C0f9.A0A(2068828962, A03);
        return ordinal;
    }
}
