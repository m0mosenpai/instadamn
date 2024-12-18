package X;

/* loaded from: classes4.dex */
public final /* synthetic */ class B5l extends C03E implements InterfaceC16820sZ {
    public B5l(Object obj) {
        super(0, obj, C23031Ai.class, "incrementNotesLightweightFeedbackTooltipSeenCount", "incrementNotesLightweightFeedbackTooltipSeenCount()V", 0);
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        InterfaceC19610xo A0g = AbstractC167017dG.A0g(((C23031Ai) this.receiver).A01, "notes_lightweight_feedback_tooltip_seen_count1");
        A0g.E7G("notes_lightweight_feedback_tooltip_last_impression_timestamp_ms", System.currentTimeMillis());
        A0g.apply();
        return C0eB.A00;
    }
}
