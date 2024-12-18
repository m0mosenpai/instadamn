package X;

/* renamed from: X.Pjl, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57758Pjl extends C0YY implements InterfaceC16620sF {
    public static final C57758Pjl A00 = new C57758Pjl();

    public C57758Pjl() {
        super(2);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        String str;
        String str2;
        AbstractC167017dG.A1N(obj, obj2);
        if (!obj2.equals(C54953OSd.A00)) {
            if (obj2 instanceof AbstractC53622NnT) {
                str = AbstractC53736Npm.A00((AbstractC53622NnT) obj2).localCallId;
            } else {
                str = null;
            }
            OXE oxe = OXE.A00;
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append("DISPATCH RECEIVED AFTER CALLSTATE == IDLE & CallUiFinished.");
            if (str != null) {
                str2 = AnonymousClass001.A0R("\nlocalCallId: ", str);
            } else {
                str2 = "";
            }
            A1C.append(str2);
            A1C.append("\naction: ");
            A1C.append(obj2);
            oxe.A04("RpStores", MSX.A0l(A1C, ' '), null);
        }
        return obj;
    }
}
