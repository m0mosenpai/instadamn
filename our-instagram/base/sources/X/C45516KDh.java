package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.instagram.direct.inbox.notes.models.NoteAudience;
import com.instagram.direct.inbox.notes.models.NoteAudienceItem;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.KDh, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45516KDh extends AbstractC43842Ja5 {
    public static final String __redex_internal_original_name = "AudiencePickerFragment";
    public C684436h A00;
    public boolean A01;
    public final InterfaceC09390do A04 = AbstractC25225BEi.A0a(new C50246MHb(this, 40), new C50246MHb(this, 41), new C50170MDx(34, null, this), AbstractC25225BEi.A1D(C44524JmU.class));
    public final InterfaceC09390do A02 = C50246MHb.A00(this, 39);
    public final InterfaceC09390do A03 = AbstractC60492pY.A02(this);

    @Override // X.AbstractC43842Ja5
    public final L5L getRecyclerConfigBuilder() {
        return configBuilder(new C50354MLg(this, 2));
    }

    @Override // X.AbstractC43842Ja5, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        MCO.A04(this, AbstractC25229BEm.A0a(this), 2);
        InterfaceC09390do interfaceC09390do = this.A04;
        C44524JmU c44524JmU = (C44524JmU) interfaceC09390do.getValue();
        Object value = ((C44524JmU) interfaceC09390do.getValue()).A01.getValue();
        C14360o3.A0B(value, 0);
        c44524JmU.A02.Egh(value);
    }

    @Override // X.AbstractC43842Ja5
    public final Collection getDefinitions() {
        return AbstractC166987dD.A1J(new KIU(this, AbstractC166987dD.A0r(this.A03), this, AbstractC167007dF.A1Z(this.A02)));
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "notes_audience_picker_sheet";
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A03);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 2002) {
            Iterator A1J = AbstractC25226BEj.A1J(((C44524JmU) this.A04.getValue()).A00.getValue());
            int i3 = 0;
            while (true) {
                if (A1J.hasNext()) {
                    if (((NoteAudienceItem) A1J.next()).A00 == NoteAudience.A05) {
                        break;
                    } else {
                        i3++;
                    }
                } else {
                    i3 = -1;
                    break;
                }
            }
            notifyItemChanged(i3);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1599542674);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A00 = new C684436h(requireActivity(), AbstractC166987dD.A0r(this.A03));
        this.A01 = AbstractC43593JPy.A1Y(requireArguments.getBoolean("is_content_note") ? 1 : 0);
        C0f9.A09(-1045675057, A02);
    }
}
