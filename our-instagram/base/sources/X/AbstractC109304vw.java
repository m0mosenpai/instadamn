package X;

import com.instagram.api.schemas.StoryPromptDisablementState;

/* renamed from: X.4vw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC109304vw {
    public static final StoryPromptDisablementState A00(String str) {
        StoryPromptDisablementState storyPromptDisablementState = (StoryPromptDisablementState) StoryPromptDisablementState.A01.get(str);
        if (storyPromptDisablementState == null) {
            return StoryPromptDisablementState.A06;
        }
        return storyPromptDisablementState;
    }
}
