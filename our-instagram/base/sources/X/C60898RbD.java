package X;

/* renamed from: X.RbD, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60898RbD extends C1P1 {
    public final /* synthetic */ C2052096l A00;

    public C60898RbD(C2052096l c2052096l) {
        this.A00 = c2052096l;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A0N = AbstractC167017dG.A0N(abstractC115105If, 1757800997);
        super.onFail(abstractC115105If);
        Throwable A01 = abstractC115105If.A01();
        if (A01 != null && (A01 instanceof VI9)) {
            C14360o3.A0C(A01, "null cannot be cast to non-null type com.instagram.graphql.error.GraphQLException");
            C1LC A0I = AbstractC43592JPx.A0I(((VI9) A01).A00);
            while (A0I.hasNext()) {
                String description = ((InterfaceC65563Tmj) A0I.next()).getDescription();
                if (description == null) {
                    description = "Session level survey fetch failed.";
                }
                C0w9.A03("session_survey_controller", description);
            }
        }
        C0f9.A0A(-697003979, A0N);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        C2JS optionalTreeField;
        int A03 = C0f9.A03(1177612708);
        AnonymousClass435 anonymousClass435 = (AnonymousClass435) obj;
        int A032 = C0f9.A03(-1648282325);
        C14360o3.A0B(anonymousClass435, 0);
        C2JS c2js = (C2JS) anonymousClass435.A01;
        if (c2js != null && (optionalTreeField = c2js.getOptionalTreeField(0, "ig_end_session_survey_uri_root_query(integration_point_id:$integration_point_id,session_id:$session_id,survey_context_data:$survey_context_data)", C59808Qnw.class, -1279632481)) != null) {
            C2052096l c2052096l = this.A00;
            c2052096l.A02 = optionalTreeField.getOptionalStringField(0, "survey_uri");
            if (optionalTreeField.hasFieldValue("survey_id")) {
                optionalTreeField.getCoercedIntField(1, "survey_id");
            }
            optionalTreeField.getOptionalStringField(3, "leaf_id");
            optionalTreeField.getOptionalStringField(2, "root_id");
            AbstractC167007dF.A0J().post(new RunnableC64608TLu(c2052096l));
        }
        C0f9.A0A(527460709, A032);
        C0f9.A0A(-799228489, A03);
    }
}
