package X;

import android.content.Context;
import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgEditText;
import com.instagram.creator.agent.suggestedreplies.constants.SuggestedRepliesLoggingConstants$SuggestedRepliesLoggingContext;
import com.instagram.creator.agent.suggestedreplies.settings.repository.CreatorAgentSuggestedRepliesSettingsRepository;
import com.instagram.direct.inbox.notes.creation.NotesCreationBubbleView;

/* renamed from: X.LuF, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49502LuF implements InterfaceC190658cN {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C49502LuF(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    @Override // X.InterfaceC190658cN
    public final boolean onToggle(boolean z) {
        EnumC46279KeB enumC46279KeB;
        String str;
        String str2;
        int A02;
        int A07;
        if (this.A00 != 0) {
            C45466KBb c45466KBb = (C45466KBb) this.A02;
            C45466KBb.A02(c45466KBb).A0F = z;
            NotesCreationBubbleView notesCreationBubbleView = c45466KBb.A0c;
            if (notesCreationBubbleView == null) {
                str2 = "bubbleView";
            } else {
                Context context = ((View) this.A01).getContext();
                if (z) {
                    A02 = R.color.clips_remix_camera_outer_container_default_background;
                } else {
                    A02 = AbstractC53242c7.A02(context);
                }
                notesCreationBubbleView.setBubbleBackgroundColor(context.getColor(A02));
                IgEditText igEditText = c45466KBb.A0I;
                if (igEditText == null) {
                    str2 = "noteEditText";
                } else {
                    if (z) {
                        A07 = R.color.audio_bar_action_color_enabled;
                    } else {
                        A07 = AbstractC53242c7.A07(context);
                    }
                    AbstractC166987dD.A1O(context, igEditText, A07);
                    return true;
                }
            }
        } else {
            C45471KBg c45471KBg = (C45471KBg) this.A02;
            L16 l16 = c45471KBg.A00;
            if (l16 == null) {
                str2 = "logger";
            } else {
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(l16.A00, "ig_creator_agents_suggested_replies_settings_toggle");
                if (A0f.isSampled()) {
                    C0Zx c0Zx = new C0Zx();
                    c0Zx.A03("toggle_enabled", Boolean.valueOf(z));
                    A0f.AAQ(c0Zx, "sr_context");
                    SuggestedRepliesLoggingConstants$SuggestedRepliesLoggingContext suggestedRepliesLoggingConstants$SuggestedRepliesLoggingContext = l16.A01;
                    String str3 = null;
                    if (suggestedRepliesLoggingConstants$SuggestedRepliesLoggingContext != null) {
                        enumC46279KeB = suggestedRepliesLoggingConstants$SuggestedRepliesLoggingContext.A00;
                    } else {
                        enumC46279KeB = null;
                    }
                    A0f.A8R(enumC46279KeB, "inbox_type");
                    if (suggestedRepliesLoggingConstants$SuggestedRepliesLoggingContext != null) {
                        str = suggestedRepliesLoggingConstants$SuggestedRepliesLoggingContext.A02;
                    } else {
                        str = null;
                    }
                    A0f.AAP("sr_session_id", str);
                    if (suggestedRepliesLoggingConstants$SuggestedRepliesLoggingContext != null) {
                        str3 = suggestedRepliesLoggingConstants$SuggestedRepliesLoggingContext.A03;
                    }
                    A0f.AAP("thread_session_id", str3);
                    AbstractC31175DnJ.A17(A0f, l16.A02);
                }
                C44510JmG c44510JmG = (C44510JmG) c45471KBg.A02.getValue();
                if (z) {
                    c44510JmG.A00();
                    return z;
                }
                CreatorAgentSuggestedRepliesSettingsRepository creatorAgentSuggestedRepliesSettingsRepository = c44510JmG.A00;
                if (AbstractC166987dD.A1a(creatorAgentSuggestedRepliesSettingsRepository.A01.getValue())) {
                    AbstractC43593JPy.A1S(creatorAgentSuggestedRepliesSettingsRepository, AbstractC25230BEn.A0s(creatorAgentSuggestedRepliesSettingsRepository.A00), ((C4A7) creatorAgentSuggestedRepliesSettingsRepository).A01, 8);
                }
                C146106i8 A0Y = AbstractC31174DnI.A0Y();
                Context context2 = ((View) this.A01).getContext();
                AbstractC25226BEj.A1N(context2, A0Y, 2131974923);
                A0Y.A0I = context2.getString(2131974922);
                AbstractC25233BEq.A1F(A0Y);
                return z;
            }
        }
        C14360o3.A0F(str2);
        throw C00O.createAndThrow();
    }
}
