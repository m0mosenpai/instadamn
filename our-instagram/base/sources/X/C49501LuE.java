package X;

/* renamed from: X.LuE, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49501LuE implements InterfaceC190658cN {
    public final int A00;
    public final Object A01;

    public C49501LuE(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC190658cN
    public final boolean onToggle(boolean z) {
        switch (this.A00) {
            case 0:
                Jn8 jn8 = (Jn8) this.A01;
                jn8.A09.Egh(new C45430K9r(z, jn8.A05.userId));
                return true;
            case 1:
                AbstractC52922bZ abstractC52922bZ = (AbstractC52922bZ) this.A01;
                C141796aw A00 = AbstractC141776au.A00(abstractC52922bZ);
                if (z) {
                    AbstractC166987dD.A1Z(new PZW((Object) abstractC52922bZ, (InterfaceC23621Ds) null, 13, true), A00);
                    return true;
                }
                AbstractC166987dD.A1Z(new MC3(abstractC52922bZ, (InterfaceC23621Ds) null, 35), A00);
                return false;
            default:
                C45466KBb c45466KBb = (C45466KBb) this.A01;
                C45466KBb.A02(c45466KBb).A0G = z;
                InterfaceC19610xo A0e = AbstractC31176DnK.A0e(AbstractC166987dD.A0r(c45466KBb.A1V));
                A0e.E77("notes_music_reshare_enabled_pref", z);
                A0e.apply();
                return true;
        }
    }
}
