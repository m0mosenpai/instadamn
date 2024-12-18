package X;

/* renamed from: X.8Jn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C185228Jn implements InterfaceC19960yQ, InterfaceC14180ni {
    public final /* synthetic */ C185118Jc A00;

    public C185228Jn(C185118Jc c185118Jc) {
        this.A00 = c185118Jc;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof InterfaceC19960yQ) && (obj instanceof InterfaceC14180ni)) {
            return C14360o3.A0K(getFunctionDelegate(), ((InterfaceC14180ni) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // X.InterfaceC14180ni
    public final InterfaceC09250da getFunctionDelegate() {
        return new C06840Yb(2, this.A00, C185118Jc.class, "onTemplateSuggestion", "onTemplateSuggestion(Lcom/instagram/creation/capture/quickcapture/sundial/template/suggestion/model/ClipsTemplateSuggestionModel;)V", 4);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // X.InterfaceC19960yQ
    public final /* bridge */ /* synthetic */ Object emit(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        C05A c05a;
        Object c211989aP;
        InterfaceC185178Ji interfaceC185178Ji = (InterfaceC185178Ji) obj;
        C185118Jc c185118Jc = this.A00;
        if (C14360o3.A0K(interfaceC185178Ji, C185238Jo.A00)) {
            c05a = c185118Jc.A04;
            c211989aP = C9LF.A00;
        } else {
            if (!C14360o3.A0K(interfaceC185178Ji, C185168Jh.A00)) {
                C14360o3.A0C(interfaceC185178Ji, "null cannot be cast to non-null type com.instagram.creation.capture.quickcapture.sundial.template.suggestion.model.ClipsTemplateSuggestionModel.Loaded");
                C211999aQ c211999aQ = (C211999aQ) interfaceC185178Ji;
                c05a = c185118Jc.A04;
                c211989aP = new C211989aP(c211999aQ.A00, c211999aQ.A01, c211999aQ);
            }
            return C0eB.A00;
        }
        c05a.Egh(c211989aP);
        return C0eB.A00;
    }
}
