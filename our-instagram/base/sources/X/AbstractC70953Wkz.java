package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.Wkz, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC70953Wkz implements C5ST {
    public final C69255VkO A00 = new C69255VkO(Integer.valueOf(R.id.clips_tooltip_chevron_icon), R.layout.clips_media_interactivity_tooltip, R.id.clips_tooltip_title_text, R.id.clips_tooltip_subtitle_text);

    @Override // X.C5ST
    public final /* bridge */ /* synthetic */ AbstractC117215Sg ANT(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C69255VkO c69255VkO;
        AbstractC167007dF.A1K(layoutInflater, viewGroup);
        if (this instanceof VC2) {
            c69255VkO = ((VC2) this).A00;
        } else {
            c69255VkO = this.A00;
        }
        return new V8J(AbstractC25226BEj.A0R(layoutInflater, viewGroup, c69255VkO.A00, false), c69255VkO.A03, c69255VkO.A02, c69255VkO.A01);
    }
}
