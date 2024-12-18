package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.api.schemas.ClipsMidCardSubtype;
import com.instagram.api.schemas.ClipsMidCardType;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public final class C2Z extends AbstractC33235ElU implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "ReelsMidcardInjectToolFragment";
    public final ClipsMidCardType[] A06 = ClipsMidCardType.values();
    public final ClipsMidCardSubtype[] A05 = ClipsMidCardSubtype.values();
    public final ArrayList A00 = AbstractC166987dD.A1E();
    public final InterfaceC09390do A04 = AbstractC60492pY.A02(this);
    public final InterfaceC09390do A03 = C1XM.A00(new D88(this, 31));
    public final List A02 = AbstractC16960so.A1Q(ClipsMidCardType.A04, ClipsMidCardType.A0J, ClipsMidCardType.A0K, ClipsMidCardType.A0M, ClipsMidCardType.A0T);
    public final List A01 = AbstractC16960so.A1Q(ClipsMidCardType.A07, ClipsMidCardType.A0D, ClipsMidCardType.A0N, ClipsMidCardType.A0S);
    public final String A07 = "reels_midcard_inject_tool";

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A04);
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        AbstractC25235BEs.A1H(interfaceC56362iU);
        interfaceC56362iU.setTitle(AbstractC25227BEk.A0v(this, 2131958309));
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A07;
    }

    @Override // X.AbstractC33235ElU, X.AbstractC60672pq, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        ClipsMidCardType clipsMidCardType;
        StringBuilder A1C;
        String str;
        int A02 = C0f9.A02(2026298355);
        super.onCreate(bundle);
        for (ClipsMidCardType clipsMidCardType2 : this.A06) {
            ArrayList arrayList = this.A00;
            Context requireContext = requireContext();
            String A0h = AbstractC167007dF.A0h(clipsMidCardType2.name());
            if (this.A02.contains(clipsMidCardType2)) {
                A1C = AbstractC166987dD.A1C();
                str = "** ";
            } else if (!this.A01.contains(clipsMidCardType2)) {
                arrayList.add(new GHY(requireContext, new ViewOnClickListenerC28665ClD(12, (Object) null, clipsMidCardType2, this), A0h));
            } else {
                A1C = AbstractC166987dD.A1C();
                str = "* ";
            }
            A1C.append(str);
            A0h = AbstractC166997dE.A0x(A0h, A1C);
            arrayList.add(new GHY(requireContext, new ViewOnClickListenerC28665ClD(12, (Object) null, clipsMidCardType2, this), A0h));
        }
        ArrayList arrayList2 = this.A00;
        arrayList2.add(new GHY(requireContext(), (View.OnClickListener) null, "------------"));
        for (ClipsMidCardSubtype clipsMidCardSubtype : this.A05) {
            switch (clipsMidCardSubtype.ordinal()) {
                case 1:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 11:
                case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                case 14:
                case 16:
                    clipsMidCardType = ClipsMidCardType.A0R;
                    break;
                case 17:
                case Process.SIGSTOP /* 19 */:
                case 20:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 38:
                case 39:
                case 40:
                case Seq.NULL_REFNUM /* 41 */:
                case Seq.RefTracker.REF_OFFSET /* 42 */:
                case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                    clipsMidCardType = ClipsMidCardType.A0T;
                    break;
                case 21:
                case 22:
                    clipsMidCardType = ClipsMidCardType.A06;
                    break;
                case 34:
                case 37:
                    clipsMidCardType = ClipsMidCardType.A0M;
                    break;
                case 35:
                case 36:
                    clipsMidCardType = ClipsMidCardType.A0N;
                    break;
            }
            Context requireContext2 = requireContext();
            StringBuilder A1C2 = AbstractC166987dD.A1C();
            A1C2.append(clipsMidCardType);
            A1C2.append(" : ");
            arrayList2.add(new GHY(requireContext2, new ViewOnClickListenerC28665ClD(12, clipsMidCardSubtype, clipsMidCardType, this), AbstractC166997dE.A0x(AbstractC167007dF.A0h(clipsMidCardSubtype.name()), A1C2)));
        }
        setItems(arrayList2);
        C0f9.A09(-1818829433, A02);
    }
}
