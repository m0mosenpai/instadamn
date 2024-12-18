package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.creation.capture.quickcapture.sundial.tts.intf.VoiceOption;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes9.dex */
public final class NHS extends AbstractC56270Oyf {
    public View A00;
    public View A01;
    public final AbstractC51119MiO A02;
    public final O7Q A03;
    public final InterfaceC16660sJ A04;
    public final C5RO A05;
    public final AC0 A06;

    public NHS(C5RO c5ro, AC0 ac0, O7Q o7q) {
        C14360o3.A0B(ac0, 2);
        this.A03 = o7q;
        this.A06 = ac0;
        this.A05 = c5ro;
        C57747Pja A00 = C57747Pja.A00(this, 48);
        this.A04 = A00;
        this.A02 = new NHR(A00);
    }

    @Override // X.InterfaceC58282Psa
    public final void COD(ViewGroup viewGroup) {
        boolean A0K;
        C9C2 CBG;
        VoiceOption voiceOption;
        C14360o3.A0B(viewGroup, 0);
        RecyclerView A0B = AbstractC43592JPx.A0B(viewGroup, R.id.text_to_speech_recycler_view);
        String str = "contentView";
        String str2 = null;
        if (A0B != null) {
            super.A00 = A0B;
            View findViewById = viewGroup.findViewById(R.id.text_to_speech_content);
            this.A00 = findViewById;
            if (findViewById != null) {
                this.A01 = findViewById.findViewById(R.id.text_to_speech_done_button);
                return;
            }
        } else {
            View inflate = AbstractC25228BEl.A0P(viewGroup).inflate(R.layout.layout_tts_bottom_sheet, (ViewGroup) null, false);
            this.A00 = inflate;
            if (inflate != null) {
                RecyclerView A0B2 = AbstractC43592JPx.A0B(inflate, R.id.text_to_speech_recycler_view);
                C14360o3.A0B(A0B2, 0);
                super.A00 = A0B2;
                View view = this.A00;
                if (view != null) {
                    View findViewById2 = view.findViewById(R.id.text_to_speech_done_button);
                    this.A01 = findViewById2;
                    if (findViewById2 == null) {
                        str = "doneButton";
                    } else {
                        ViewOnClickListenerC55460OkF.A00(findViewById2, 24, this);
                        View view2 = this.A00;
                        if (view2 != null) {
                            viewGroup.addView(view2, new LinearLayout.LayoutParams(-1, -1));
                            A00().setLayoutManager(new GridLayoutManager(A00().getContext(), 3, 1, false));
                            RecyclerView A00 = A00();
                            AbstractC51119MiO abstractC51119MiO = this.A02;
                            A00.setAdapter(abstractC51119MiO);
                            C5RO c5ro = this.A05;
                            if (c5ro != null && (CBG = c5ro.CBG()) != null && (voiceOption = (VoiceOption) CBG.A01) != null) {
                                str2 = voiceOption.A00;
                            }
                            AC0 ac0 = this.A06;
                            List A002 = ac0.A00();
                            ArrayList A0q = AbstractC167017dG.A0q(A002);
                            int i = 0;
                            for (Object obj : A002) {
                                int i2 = i + 1;
                                if (i < 0) {
                                    AbstractC16960so.A1U();
                                    throw C00O.createAndThrow();
                                }
                                VoiceOption voiceOption2 = (VoiceOption) obj;
                                String str3 = voiceOption2.A00;
                                String A1A = AbstractC166987dD.A1A(voiceOption2, ac0.A01());
                                if (i == 0) {
                                    if (str2 != null) {
                                        A0K = false;
                                        if (str2.length() != 0) {
                                        }
                                    }
                                    A0K = true;
                                } else {
                                    A0K = C14360o3.A0K(str3, str2);
                                }
                                A0q.add(new C51823MvR(str3, A1A, 0, A0K, false));
                                i = i2;
                            }
                            abstractC51119MiO.A00(A0q);
                            return;
                        }
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
