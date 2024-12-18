package X;

/* renamed from: X.1iz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C33991iz extends AbstractC33951iv {
    public static final C1OZ A02 = new C1OZ() { // from class: X.1j0
        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            C33991iz parseFromJson = F5U.parseFromJson(c16l);
            C14360o3.A07(parseFromJson);
            return parseFromJson;
        }

        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.direct.send.mutation.model.DirectConfigurePromptResponseMutation");
            C33991iz c33991iz = (C33991iz) obj;
            anonymousClass182.A0d();
            anonymousClass182.A0Q("thread_subtype", c33991iz.A01);
            anonymousClass182.A0Q("thread_audience", c33991iz.A00);
            FV3.A00(anonymousClass182, c33991iz);
            anonymousClass182.A0a();
        }
    };
    public int A00;
    public int A01;

    @Override // X.C1OW
    public final String A02() {
        return "configure_prompt_response";
    }

    @Override // X.AbstractC29011ae
    public final /* bridge */ /* synthetic */ Object A05() {
        return C16930sl.A00;
    }
}
