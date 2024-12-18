package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.ui.widget.radiogroup.IgRadioGroup;
import java.util.List;

/* loaded from: classes9.dex */
public final class N8e extends C2UT implements InterfaceC65242xM {
    public final List A00;
    public final UserSession A01;

    public N8e(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = AbstractC166987dD.A1E();
    }

    @Override // android.widget.ListAdapter
    public final boolean areAllItemsEnabled() {
        return false;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        C14360o3.A0B(viewGroup, 2);
        C3OO onCreateViewHolder = onCreateViewHolder(viewGroup, getItemViewType(i));
        onBindViewHolder(onCreateViewHolder, i);
        return AbstractC31171DnF.A06(onCreateViewHolder);
    }

    @Override // android.widget.ListAdapter
    public final boolean isEnabled(int i) {
        return false;
    }

    @Override // X.C2UU
    public final C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        EnumC53102NeF enumC53102NeF;
        C14360o3.A0B(viewGroup, 0);
        EnumC53102NeF[] enumC53102NeFArr = EnumC53102NeF.A01;
        int length = enumC53102NeFArr.length;
        int i2 = 0;
        while (true) {
            if (i2 < length) {
                enumC53102NeF = enumC53102NeFArr[i2];
                if (enumC53102NeF.A00 == i) {
                    break;
                }
                i2++;
            } else {
                enumC53102NeF = EnumC53102NeF.A07;
                break;
            }
        }
        return enumC53102NeF.A00(AbstractC166997dE.A0L(viewGroup), viewGroup);
    }

    @Override // X.InterfaceC65242xM
    public final /* bridge */ /* synthetic */ Object getAdapter() {
        return this;
    }

    @Override // android.widget.Adapter, X.InterfaceC65242xM
    public final /* bridge */ /* synthetic */ Object getItem(int i) {
        return this.A00.get(i);
    }

    @Override // X.C2UU
    public final void onBindViewHolder(C3OO c3oo, int i) {
        EnumC53102NeF enumC53102NeF;
        C51293MlG c51293MlG;
        C51245MkU c51245MkU;
        boolean z;
        String username;
        C208059Im c208059Im;
        C14360o3.A0B(c3oo, 0);
        List list = this.A00;
        Object obj = list.get(i);
        if (obj instanceof C52441NIl) {
            enumC53102NeF = EnumC53102NeF.A04;
        } else if (obj instanceof C52440NIk) {
            enumC53102NeF = EnumC53102NeF.A05;
        } else if (obj instanceof C52442NIm) {
            enumC53102NeF = EnumC53102NeF.A06;
        } else {
            throw B4Z.A00();
        }
        UserSession userSession = this.A01;
        Context A03 = AbstractC37301Gc2.A03(c3oo);
        AbstractC53454Nkh abstractC53454Nkh = (AbstractC53454Nkh) list.get(i);
        if (!(enumC53102NeF instanceof C52446NIq)) {
            if (enumC53102NeF instanceof C52445NIp) {
                C14360o3.A0B(userSession, 0);
                C14360o3.A0B(abstractC53454Nkh, 3);
                C52442NIm c52442NIm = null;
                if (c3oo instanceof C51245MkU) {
                    c51245MkU = (C51245MkU) c3oo;
                } else {
                    c51245MkU = null;
                }
                if (abstractC53454Nkh instanceof C52442NIm) {
                    c52442NIm = (C52442NIm) abstractC53454Nkh;
                }
                if (c51245MkU != null && c52442NIm != null) {
                    IgRadioGroup igRadioGroup = c51245MkU.A00;
                    igRadioGroup.removeAllViews();
                    int i2 = 0;
                    for (Object obj2 : c52442NIm.A02) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            AbstractC16960so.A1U();
                            throw C00O.createAndThrow();
                        }
                        C54682ODi c54682ODi = (C54682ODi) obj2;
                        String str = c52442NIm.A01;
                        C50814Mck c50814Mck = new C50814Mck(A03);
                        c50814Mck.setId(i2);
                        String str2 = c54682ODi.A04;
                        c50814Mck.setTag(str2);
                        C5QE c5qe = c54682ODi.A02;
                        if (c5qe != null) {
                            c50814Mck.setTitleText(c5qe);
                        }
                        C5QE c5qe2 = c54682ODi.A01;
                        if (c5qe2 != null) {
                            c50814Mck.setSubTitleText(c5qe2);
                        }
                        EnumC53223NgL enumC53223NgL = c54682ODi.A03;
                        if (enumC53223NgL != null) {
                            int ordinal = enumC53223NgL.ordinal();
                            if (ordinal != 0) {
                                if (ordinal != 1) {
                                    if (ordinal != 2 && ordinal != 3) {
                                        throw B4Z.A00();
                                    }
                                } else {
                                    A9M A01 = C97F.A01(C97F.A00(N7Z.class), userSession);
                                    if (A01 == null || (c208059Im = A01.A00) == null || (username = c208059Im.A00(C97F.A00(N7Z.class), userSession)) == null) {
                                        username = "";
                                    }
                                    c50814Mck.setMetadataText(username);
                                }
                            }
                            username = AbstractC166997dE.A0Y(userSession).getUsername();
                            c50814Mck.setMetadataText(username);
                        }
                        C5QE c5qe3 = c54682ODi.A00;
                        if (c5qe3 != null) {
                            c50814Mck.setContentDescription(c5qe3);
                        }
                        if (str != null) {
                            z = str.equals(str2);
                        } else {
                            z = false;
                        }
                        c50814Mck.setChecked(z);
                        igRadioGroup.addView(c50814Mck, i2, new LinearLayout.LayoutParams(-1, -2));
                        i2 = i3;
                    }
                    igRadioGroup.A02 = c52442NIm.A00;
                    return;
                }
                return;
            }
            if (enumC53102NeF instanceof C52444NIo) {
                AbstractC167007dF.A1E(userSession, 0, abstractC53454Nkh);
                return;
            }
            AbstractC167007dF.A1E(userSession, 0, abstractC53454Nkh);
            C52441NIl c52441NIl = null;
            if (c3oo instanceof C51293MlG) {
                c51293MlG = (C51293MlG) c3oo;
            } else {
                c51293MlG = null;
            }
            if (abstractC53454Nkh instanceof C52441NIl) {
                c52441NIl = (C52441NIl) abstractC53454Nkh;
            }
            if (c51293MlG != null && c52441NIl != null) {
                IgSimpleImageView igSimpleImageView = c51293MlG.A00;
                igSimpleImageView.setImageResource(R.drawable.instagram_x_pano_filled_24);
                C0fQ.A00(c52441NIl.A00, igSimpleImageView);
                c51293MlG.A02.setText(2131957294);
                IgSimpleImageView igSimpleImageView2 = c51293MlG.A01;
                igSimpleImageView2.setImageResource(R.drawable.instagram_check_pano_filled_24);
                C0fQ.A00(c52441NIl.A01, igSimpleImageView2);
            }
        }
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(20765416);
        int size = this.A00.size();
        C0f9.A0A(-301563494, A03);
        return size;
    }

    @Override // X.C2UU, android.widget.Adapter
    public final int getItemViewType(int i) {
        EnumC53102NeF enumC53102NeF;
        int A03 = C0f9.A03(1966139118);
        Object obj = this.A00.get(i);
        if (obj instanceof C52441NIl) {
            enumC53102NeF = EnumC53102NeF.A04;
        } else if (obj instanceof C52440NIk) {
            enumC53102NeF = EnumC53102NeF.A05;
        } else if (obj instanceof C52442NIm) {
            enumC53102NeF = EnumC53102NeF.A06;
        } else {
            throw B4Z.A00();
        }
        int i2 = enumC53102NeF.A00;
        C0f9.A0A(-1287201536, A03);
        return i2;
    }

    @Override // android.widget.Adapter
    public final int getViewTypeCount() {
        return EnumC53102NeF.values().length;
    }
}
