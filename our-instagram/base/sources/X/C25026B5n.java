package X;

/* renamed from: X.B5n, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C25026B5n extends C03E implements InterfaceC16820sZ {
    public C25026B5n(Object obj) {
        super(0, obj, C23031Ai.class, "incrementNotesPromptResponseReplyTooltipSeenCount", "incrementNotesPromptResponseReplyTooltipSeenCount()V", 0);
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        InterfaceC19610xo A0g = AbstractC167017dG.A0g(((C23031Ai) this.receiver).A01, "notes_prompt_response_reply_tooltip_seen_count");
        A0g.E7G("notes_prompt_response_reply_tooltip_last_impression_timestamp_ms", System.currentTimeMillis());
        A0g.apply();
        return C0eB.A00;
    }
}
