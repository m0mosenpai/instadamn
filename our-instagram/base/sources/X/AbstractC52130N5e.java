package X;

import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.edit.model.ClipsTimelineEditorConfig;
import java.io.Serializable;

/* renamed from: X.N5e, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC52130N5e extends AbstractC59962oe implements InterfaceC60072op {
    public static final String __redex_internal_original_name = "ClipsTimelineEditorBaseFragment";
    public C1810981l A00;
    public C89P A03;
    public final InterfaceC09390do A05 = AbstractC60492pY.A02(this);
    public C5JK A04 = C5JK.A05;
    public EnumC222689s9 A01 = EnumC222689s9.A03;
    public ClipsTimelineEditorConfig A02 = new ClipsTimelineEditorConfig(false, false, false, 2);

    public final UserSession A0N() {
        return AbstractC166987dD.A0r(this.A05);
    }

    public final C89P A0O() {
        C89P c89p = this.A03;
        if (c89p != null) {
            return c89p;
        }
        C14360o3.A0F("clipsTemplateViewModel");
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return AbstractC166987dD.A0r(this.A05);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x007e -> B:13:0x0091). Please report as a decompilation issue!!! */
    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        ClipsTimelineEditorConfig clipsTimelineEditorConfig;
        EnumC222689s9 enumC222689s9;
        C5JK c5jk;
        int A02 = C0f9.A02(7936791);
        super.onCreate(bundle);
        requireArguments();
        int i = Build.VERSION.SDK_INT;
        Bundle requireArguments = requireArguments();
        try {
            if (i >= 33) {
                C5JK c5jk2 = (C5JK) requireArguments.getSerializable("ARG_CLIPS_CREATION_TYPE", C5JK.class);
                if (c5jk2 != null) {
                    this.A04 = c5jk2;
                }
                EnumC222689s9 enumC222689s92 = (EnumC222689s9) requireArguments().getSerializable("ARG_EDITOR_TRANSITION_SOURCE", EnumC222689s9.class);
                if (enumC222689s92 != null) {
                    this.A01 = enumC222689s92;
                }
                ClipsTimelineEditorConfig clipsTimelineEditorConfig2 = (ClipsTimelineEditorConfig) requireArguments().getSerializable("ARG_EDITOR_CONFIG", ClipsTimelineEditorConfig.class);
                if (clipsTimelineEditorConfig2 != null) {
                    this.A02 = clipsTimelineEditorConfig2;
                }
            } else {
                Serializable serializable = requireArguments.getSerializable("ARG_CLIPS_CREATION_TYPE");
                if ((serializable instanceof C5JK) && (c5jk = (C5JK) serializable) != null) {
                    this.A04 = c5jk;
                }
                Serializable serializable2 = requireArguments().getSerializable("ARG_EDITOR_TRANSITION_SOURCE");
                if ((serializable2 instanceof EnumC222689s9) && (enumC222689s9 = (EnumC222689s9) serializable2) != null) {
                    this.A01 = enumC222689s9;
                }
                Serializable serializable3 = requireArguments().getSerializable("ARG_EDITOR_CONFIG");
                if ((serializable3 instanceof ClipsTimelineEditorConfig) && (clipsTimelineEditorConfig = (ClipsTimelineEditorConfig) serializable3) != null) {
                    this.A02 = clipsTimelineEditorConfig;
                }
            }
        } catch (BadParcelableException e) {
            AbstractC167017dG.A1J(C18950wb.A01, "ARG_EDITOR_CONFIG BadParcelableException", e, 613296938);
            this.A02 = new ClipsTimelineEditorConfig(false, false, false, 2);
        }
        FragmentActivity requireActivity = requireActivity();
        InterfaceC09390do interfaceC09390do = this.A05;
        C89P A0X = MSZ.A0X(AbstractC183548Cd.A00(requireActivity(), AbstractC166987dD.A0r(interfaceC09390do)), requireActivity);
        C14360o3.A0B(A0X, 0);
        this.A03 = A0X;
        C1810981l c1810981l = (C1810981l) MSW.A0F(new C1810881k(requireActivity(), AbstractC166987dD.A0r(interfaceC09390do), false, false), requireActivity()).A00(C1810981l.class);
        C14360o3.A0B(c1810981l, 0);
        this.A00 = c1810981l;
        C0f9.A09(1889051176, A02);
    }
}
