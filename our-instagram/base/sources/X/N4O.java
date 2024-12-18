package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.NumberPicker;
import com.facebook.R;
import java.util.Arrays;

/* loaded from: classes9.dex */
public final class N4O extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "MusicOverlayEditMusicDurationFragment";
    public View A00;
    public NumberPicker A01;
    public C210739Tv A02;
    public final InterfaceC09390do A03 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "music_duration_picker";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A02 = (C210739Tv) AbstractC31175DnJ.A0A(this).A00(C210739Tv.class);
        View requireViewById = view.requireViewById(R.id.music_duration_picker_sheet);
        this.A00 = requireViewById;
        String str = "durationPickerSheet";
        if (requireViewById != null) {
            ViewOnClickListenerC55456OkA.A00(AbstractC166997dE.A0S(requireViewById, R.id.music_duration_picker_done_button), 24, this);
            Bundle bundle2 = this.mArguments;
            if (bundle2 != null) {
                int i = bundle2.getInt("args_max_duration_seconds", 15);
                View view2 = this.A00;
                if (view2 != null) {
                    NumberPicker numberPicker = (NumberPicker) view2.requireViewById(R.id.music_duration_number_picker);
                    this.A01 = numberPicker;
                    str = "numberPicker";
                    if (numberPicker != null) {
                        numberPicker.setMinValue(5);
                        NumberPicker numberPicker2 = this.A01;
                        if (numberPicker2 != null) {
                            numberPicker2.setMaxValue(i);
                            int i2 = (i - 5) + 1;
                            String[] strArr = new String[i2];
                            NumberPicker numberPicker3 = this.A01;
                            if (numberPicker3 != null) {
                                String A0p = AbstractC166997dE.A0p(numberPicker3.getContext(), 2131967930);
                                for (int i3 = 0; i3 < i2; i3++) {
                                    strArr[i3] = AbstractC166997dE.A0z(A0p, Arrays.copyOf(AbstractC25228BEl.A1Y(i3 + 5), 1));
                                }
                                NumberPicker numberPicker4 = this.A01;
                                if (numberPicker4 != null) {
                                    numberPicker4.setDisplayedValues(strArr);
                                    NumberPicker numberPicker5 = this.A01;
                                    if (numberPicker5 != null) {
                                        numberPicker5.setOnValueChangedListener(new C55520OlE(this, 0));
                                        NumberPicker numberPicker6 = this.A01;
                                        if (numberPicker6 != null) {
                                            numberPicker6.setWrapSelectorWheel(false);
                                            NumberPicker numberPicker7 = this.A01;
                                            if (numberPicker7 != null) {
                                                numberPicker7.setDescendantFocusability(393216);
                                                NumberPicker numberPicker8 = this.A01;
                                                if (numberPicker8 != null) {
                                                    C210739Tv c210739Tv = this.A02;
                                                    if (c210739Tv == null) {
                                                        str = "musicOverlayDurationViewModel";
                                                    } else {
                                                        numberPicker8.setValue(AbstractC167017dG.A0K((Number) c210739Tv.A00.A02()));
                                                        return;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A03);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1264175080);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.music_duration_picker, viewGroup, false);
        C0f9.A09(-1523788427, A02);
        return inflate;
    }
}
