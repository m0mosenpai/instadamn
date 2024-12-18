package X;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.view.View;
import com.facebook.cameracore.mediapipeline.services.uicontrol.PickerConfiguration;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.SimpleImageUrl;

/* renamed from: X.8JC, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8JC extends C8JD {
    public PickerConfiguration A00;
    public InterfaceC25157BBb A01;
    public boolean A02;
    public final InterfaceC11380iw A03;

    @Override // X.C8JE, X.C8JF
    public final void A02(int i) {
        A08(i, !this.A02);
    }

    public final void A08(int i, boolean z) {
        if ((i == ((C8JF) this).A00 && !((C8JE) this).A02) || !A06(i)) {
            return;
        }
        this.A02 = !z;
        if (z) {
            this.A06.A05(10L);
        }
        int i2 = ((C8JF) this).A00;
        ((C8JF) this).A00 = i;
        notifyItemChanged(i2);
        notifyItemChanged(((C8JF) this).A00);
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onBindViewHolder(C3OO c3oo, int i) {
        String str;
        PickerConfiguration.ItemConfiguration itemConfiguration;
        C9V2 c9v2 = (C9V2) c3oo;
        C14360o3.A0B(c9v2, 0);
        PickerConfiguration pickerConfiguration = this.A00;
        if (pickerConfiguration == null) {
            str = "Should not be able to bind picker configuration without a picker configuration";
        } else {
            PickerConfiguration.ItemConfiguration[] itemConfigurationArr = pickerConfiguration.mItems;
            if (itemConfigurationArr != null && (itemConfiguration = itemConfigurationArr[i]) != null) {
                A07(c9v2, i);
                String str2 = itemConfiguration.mImageUri;
                int i2 = 0;
                if (str2 != null) {
                    c9v2.A0A.A0D(this.A03, null, new SimpleImageUrl(str2), false);
                    return;
                }
                byte[] bArr = itemConfiguration.mImageData;
                if (bArr != null) {
                    C8FY c8fy = new C8FY(((C8JF) this).A01.getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length));
                    c8fy.A00();
                    c9v2.A0A.setImageDrawable(c8fy);
                }
                View view = c9v2.A08;
                if (i != ((C8JF) this).A00 || !((C8JE) this).A02) {
                    i2 = 8;
                }
                view.setVisibility(i2);
                return;
            }
            str = "Item configurations should never be null";
        }
        AbstractC12120kG.A07("GenericEffectPickerAdapter", str, null);
    }

    public C8JC(final Context context, InterfaceC11380iw interfaceC11380iw, final UserSession userSession, final C8C1 c8c1) {
        new C8JE(context, userSession, c8c1) { // from class: X.8JD
            public final UserSession A00;

            {
                C8FI c8fi = new C8FI() { // from class: X.8JG
                    @Override // X.C8FI
                    public final void DDA(C88X c88x) {
                    }

                    @Override // X.C8FJ
                    public final /* synthetic */ void DDC(InterfaceC120325cX interfaceC120325cX, String str, int i, boolean z) {
                    }

                    @Override // X.C8FJ
                    public final /* synthetic */ void DNh(InterfaceC120325cX interfaceC120325cX, int i) {
                    }
                };
                this.A00 = userSession;
            }
        };
        this.A03 = interfaceC11380iw;
    }

    @Override // X.C8JF, X.C2UU
    public final int getItemCount() {
        int i;
        PickerConfiguration.ItemConfiguration[] itemConfigurationArr;
        int A03 = C0f9.A03(1402225690);
        PickerConfiguration pickerConfiguration = this.A00;
        if (pickerConfiguration != null && (itemConfigurationArr = pickerConfiguration.mItems) != null) {
            i = itemConfigurationArr.length;
        } else {
            i = 0;
        }
        C0f9.A0A(-831656247, A03);
        return i;
    }
}
