package X;

import com.facebook.R;

/* loaded from: classes11.dex */
public final class VC2 extends AbstractC70953Wkz {
    public C69255VkO A00 = new C69255VkO(null, R.layout.clips_prism_media_interactivity_tooltip, R.id.clips_prism_tooltip_title_text, R.id.clips_prism_tooltip_subtitle_text);
    public final CharSequence A01;
    public final CharSequence A02;

    @Override // X.C5ST
    public final /* bridge */ /* synthetic */ void ADz(C5SV c5sv, AbstractC117215Sg abstractC117215Sg) {
        V8J v8j = (V8J) abstractC117215Sg;
        C14360o3.A0B(v8j, 0);
        CharSequence charSequence = this.A02;
        if (charSequence.length() > 0) {
            v8j.A01.setText(charSequence);
        }
        CharSequence charSequence2 = this.A01;
        if (charSequence2.length() > 0) {
            v8j.A00.setText(charSequence2);
        }
    }

    public VC2(CharSequence charSequence, CharSequence charSequence2) {
        this.A02 = charSequence;
        this.A01 = charSequence2;
    }
}
