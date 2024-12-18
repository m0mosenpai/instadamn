package X;

import android.os.Bundle;
import com.instagram.api.schemas.StoryPollColorType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.F0x, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34044F0x {
    public static final C32276EJl A00(InterfaceC101404gy interfaceC101404gy, String str, boolean z) {
        String str2;
        String A1A;
        C32276EJl c32276EJl = new C32276EJl();
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putBoolean(MSV.A00(178), z);
        A0b.putBoolean("args_caption_is_poll_question", true);
        if (interfaceC101404gy != null) {
            List C5D = interfaceC101404gy.C5D();
            ArrayList arrayList = null;
            if (C5D != null) {
                arrayList = AbstractC166987dD.A1E();
                Iterator it = C5D.iterator();
                while (it.hasNext()) {
                    String text = ((InterfaceC101384gv) it.next()).getText();
                    if (text != null && (A1A = AbstractC25228BEl.A1A(text)) != null && A1A.length() != 0) {
                        arrayList.add(A1A);
                    }
                }
            }
            A0b.putStringArrayList("args_poll_options_text_list", AbstractC166987dD.A1F(arrayList));
            StoryPollColorType ApJ = interfaceC101404gy.ApJ();
            if (ApJ != null) {
                str2 = ApJ.A00;
            } else {
                str2 = null;
            }
            A0b.putString("args_selected_poll_type_color", str2);
            A0b.putBoolean("args_should_show_delete_poll_button", true);
        }
        if (str == null) {
            if (interfaceC101404gy != null) {
                str = interfaceC101404gy.getQuestion();
            }
            c32276EJl.setArguments(A0b);
            return c32276EJl;
        }
        A0b.putString("args_poll_question_text", str);
        c32276EJl.setArguments(A0b);
        return c32276EJl;
    }
}
