package X;

import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import java.util.List;

/* loaded from: classes6.dex */
public final class E08 extends C2UU implements InterfaceC69543Ao {
    public final List A00;
    public final List A01;
    public final InterfaceC11380iw A02;
    public final UserSession A03;
    public final EMP A04;

    public E08(InterfaceC11380iw interfaceC11380iw, UserSession userSession, EMP emp) {
        C14360o3.A0B(userSession, 1);
        this.A03 = userSession;
        this.A02 = interfaceC11380iw;
        this.A04 = emp;
        this.A01 = AbstractC166987dD.A1E();
        this.A00 = AbstractC166987dD.A1E();
    }

    @Override // X.InterfaceC69543Ao
    public final int CNP(Reel reel) {
        C14360o3.A0B(reel, 0);
        return this.A01.indexOf(reel);
    }

    @Override // X.InterfaceC69543Ao
    public final int CNQ(Reel reel, C41181vS c41181vS) {
        C14360o3.A0B(reel, 0);
        return this.A01.indexOf(reel);
    }

    @Override // X.InterfaceC69543Ao
    public final void EcN(List list, boolean z, UserSession userSession) {
        C14360o3.A0B(list, 0);
        AbstractC31175DnJ.A0x(this, list, this.A01);
    }

    @Override // X.C2UU
    public final C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        C14360o3.A0B(viewGroup, 0);
        if (i == 0) {
            int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
            return new C31987E3p((ViewGroup) AbstractC31175DnJ.A07(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.group_mention_user_list_row, false));
        }
        throw AbstractC25230BEn.A0n(MSV.A00(1686), i);
    }

    @Override // X.InterfaceC69543Ao
    public final Object Bla(int i) {
        return this.A01.get(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00c5, code lost:
    
        if (r1 == 0) goto L17;
     */
    @Override // X.C2UU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(X.C3OO r19, int r20) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E08.onBindViewHolder(X.3OO, int):void");
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(1165981921);
        int size = this.A00.size();
        C0f9.A0A(1600236827, A03);
        return size;
    }

    @Override // X.C2UU, android.widget.Adapter
    public final int getItemViewType(int i) {
        C0f9.A0A(-1384087837, C0f9.A03(-90623725));
        return 0;
    }
}
