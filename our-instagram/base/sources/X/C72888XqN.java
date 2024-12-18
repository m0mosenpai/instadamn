package X;

import com.instagram.api.schemas.MediaPromptPrefType;
import com.instagram.api.schemas.StoryPromptDisablementState;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.XqN, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72888XqN {
    /* JADX WARN: Type inference failed for: r1v1, types: [X.XZC, X.1um, X.1ul] */
    public static XZC parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("anonymous_prompt_explanation".equals(A0q)) {
                    c40791um.A02 = AbstractC53787Nqd.parseFromJson(c16l);
                } else {
                    ArrayList arrayList = null;
                    if (AbstractC111324zv.A00(743).equals(A0q)) {
                        c40791um.A00 = AbstractC40068Hpu.A00(AbstractC167017dG.A0m(c16l));
                    } else if ("disablement_state".equals(A0q)) {
                        c40791um.A03 = AbstractC109304vw.A00(AbstractC167017dG.A0m(c16l));
                    } else if ("disclaimer_text".equals(A0q)) {
                        c40791um.A07 = AbstractC167017dG.A0m(c16l);
                    } else if (AbstractC111324zv.A00(1132).equals(A0q)) {
                        c40791um.A01 = AbstractC40068Hpu.A00(AbstractC167017dG.A0m(c16l));
                    } else if ("original_prompt".equals(A0q)) {
                        c40791um.A04 = AbstractC53788Nqe.parseFromJson(c16l);
                    } else if ("participations".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = AbstractC166987dD.A1E();
                            while (c16l.A1J() != C16R.A08) {
                                C51802Mv6 parseFromJson = AbstractC53789Nqf.parseFromJson(c16l);
                                if (parseFromJson != null) {
                                    arrayList.add(parseFromJson);
                                }
                            }
                        }
                        c40791um.A08 = arrayList;
                    } else if ("remaining_user_ids_to_materialize".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = AbstractC166987dD.A1E();
                            while (c16l.A1J() != C16R.A08) {
                                AbstractC167027dH.A0w(c16l, arrayList);
                            }
                        }
                        c40791um.A09 = arrayList;
                    } else if ("subsequent_page_size".equals(A0q)) {
                        c40791um.A06 = Integer.valueOf(c16l.A1D());
                    } else {
                        C55702hA.A01(c16l, c40791um, A0q);
                    }
                }
                c16l.A0z();
            }
            C51800Mv4 c51800Mv4 = c40791um.A02;
            MediaPromptPrefType mediaPromptPrefType = c40791um.A00;
            C14360o3.A0A(mediaPromptPrefType);
            StoryPromptDisablementState storyPromptDisablementState = c40791um.A03;
            C14360o3.A0A(storyPromptDisablementState);
            String str = c40791um.A07;
            C14360o3.A0A(str);
            MediaPromptPrefType mediaPromptPrefType2 = c40791um.A01;
            C14360o3.A0A(mediaPromptPrefType2);
            C51801Mv5 c51801Mv5 = c40791um.A04;
            C14360o3.A0A(c51801Mv5);
            List list = c40791um.A08;
            C14360o3.A0A(list);
            List list2 = c40791um.A09;
            Integer num = c40791um.A06;
            C14360o3.A0A(num);
            c40791um.A05 = new C51804Mv8(mediaPromptPrefType, mediaPromptPrefType2, c51800Mv4, storyPromptDisablementState, c51801Mv5, str, list, list2, num.intValue());
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
