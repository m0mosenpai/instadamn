package X;

import com.instagram.direct.messagethread.reactions.datamodel.DirectCountBasedReaction;

/* loaded from: classes6.dex */
public final class GWL extends C0YY implements InterfaceC16620sF {
    public static final GWL A00 = new GWL();

    public GWL() {
        super(2);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        DirectCountBasedReaction directCountBasedReaction = (DirectCountBasedReaction) obj;
        DirectCountBasedReaction directCountBasedReaction2 = (DirectCountBasedReaction) obj2;
        AbstractC167017dG.A1N(directCountBasedReaction, directCountBasedReaction2);
        return Integer.valueOf(C14360o3.A00(directCountBasedReaction.A00, directCountBasedReaction2.A00));
    }
}
