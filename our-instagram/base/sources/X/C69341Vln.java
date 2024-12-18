package X;

import android.view.View;
import com.facebook.R;
import com.instagram.igds.components.form.IgFormField;
import com.instagram.ui.igeditseekbar.IgEditSeekBar;
import com.instagram.ui.widget.radiogroup.IgRadioGroup;

/* renamed from: X.Vln, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69341Vln {
    public View A00;
    public IgFormField A01;
    public IgFormField A02;
    public IgEditSeekBar A03;
    public IgRadioGroup A04;
    public final String A05;

    public C69341Vln(View view, String str) {
        this.A05 = str;
        if ("budget_slider".equals(str)) {
            this.A03 = (IgEditSeekBar) view.requireViewById(R.id.budget_slider);
            this.A04 = (IgRadioGroup) view.requireViewById(R.id.budget_radio_group);
            this.A01 = (IgFormField) view.findViewById(R.id.custom_budget_input_box);
            return;
        }
        if ("duration_slider".equals(str)) {
            this.A03 = (IgEditSeekBar) view.requireViewById(R.id.duration_slider);
            this.A04 = (IgRadioGroup) view.requireViewById(R.id.duration_radio_group);
            View findViewById = view.findViewById(R.id.custom_duration_input);
            this.A00 = findViewById;
            this.A02 = findViewById != null ? (IgFormField) findViewById.findViewById(R.id.custom_duration_input_box) : null;
            return;
        }
        if ("radius_slider".equals(str)) {
            this.A03 = (IgEditSeekBar) view.requireViewById(R.id.radius_slider);
            return;
        }
        throw new IllegalArgumentException("Unknown view to get IgEditSeekBar view");
    }
}
