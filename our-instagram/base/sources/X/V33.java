package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.textcell.IgdsListCell;
import java.util.Iterator;

/* loaded from: classes11.dex */
public final class V33 extends AbstractC65632xz {
    public final VDR A00;
    public final Context A01;
    public final C67897V1f A02;

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        if (anonymousClass306 != null) {
            anonymousClass306.A7a(this.A00.A00);
        }
    }

    public V33(Context context, VDR vdr, C67897V1f c67897V1f) {
        this.A01 = context;
        this.A02 = c67897V1f;
        this.A00 = vdr;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        Object obj3;
        C69365VmB c69365VmB;
        String str;
        int A03 = C0f9.A03(929728284);
        Iterator<E> it = VDR.A01.iterator();
        while (true) {
            if (it.hasNext()) {
                obj3 = it.next();
                if (((VDR) obj3).A00 == i) {
                    break;
                }
            } else {
                obj3 = null;
                break;
            }
        }
        VDR vdr = (VDR) obj3;
        if (vdr == null) {
            vdr = VDR.A03;
        }
        if (view != null && obj != null && (obj instanceof C69365VmB) && (c69365VmB = (C69365VmB) obj) != null) {
            C67897V1f c67897V1f = this.A02;
            C14360o3.A0B(c67897V1f, 2);
            Object tag = view.getTag();
            C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.wellbeing.reporting.common.adapter.SupportResourcesViewBinder.Holder");
            VgS vgS = (VgS) tag;
            if (c69365VmB.A00.ordinal() == 14) {
                WNS wns = new WNS(c67897V1f, 45);
                int ordinal = vdr.ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        IgdsListCell igdsListCell = vgS.A01;
                        if (igdsListCell != null) {
                            String str2 = c69365VmB.A03.A00;
                            C14360o3.A07(str2);
                            igdsListCell.A0I(str2);
                            String str3 = c69365VmB.A02.A00;
                            C14360o3.A07(str3);
                            igdsListCell.A0H(str3);
                            igdsListCell.setTextCellType(EnumC53237Nga.A04);
                            Drawable drawable = view.getContext().getDrawable(R.drawable.instagram_heart_pano_outline_24);
                            if (drawable != null) {
                                igdsListCell.A09(drawable);
                            }
                            C0fQ.A00(wns, igdsListCell);
                            igdsListCell.setVisibility(0);
                            C67844UzI c67844UzI = c67897V1f.A09;
                            if (c67844UzI != null) {
                                str = c67844UzI.A00().A00();
                            } else {
                                str = null;
                            }
                            C69174Vj3 c69174Vj3 = c67897V1f.A0A;
                            Integer A00 = AbstractC68602VXd.A00(str);
                            C14360o3.A0B(A00, 1);
                            UserSession userSession = c69174Vj3.A01;
                            if (C18U.A06(C06090Tz.A05, userSession, 36326829094680726L)) {
                                C18920wW A01 = AbstractC12220kQ.A01(c69174Vj3.A00, userSession);
                                InterfaceC02590Ai A002 = A01.A00(A01.A00, "mwb_support_hub_entry_point_impression");
                                if (A002.isSampled()) {
                                    A002.AAP("logger_session_id", c69174Vj3.A02);
                                    A002.AAP("hub_entry_point", "frx_flow");
                                    A002.AAP("hub_use_case_type", AbstractC68603VXe.A00(A00));
                                    A002.Cht();
                                }
                            }
                        }
                    } else {
                        throw new RuntimeException();
                    }
                } else {
                    View view2 = vgS.A00;
                    if (view2 != null) {
                        AbstractC167007dF.A0N(view2, R.id.support_resource_action_title).setText(c69365VmB.A03.A00);
                        String str4 = c69365VmB.A02.A00;
                        C14360o3.A07(str4);
                        if (AbstractC001900j.A0T(str4)) {
                            AbstractC166997dE.A0S(view2, R.id.support_resource_action_subtitle).setVisibility(8);
                        } else {
                            AbstractC167007dF.A0N(view2, R.id.support_resource_action_subtitle).setText(c69365VmB.A02.A00);
                        }
                        C0fQ.A00(wns, view2);
                        view2.setVisibility(0);
                    }
                }
            } else {
                View view3 = vgS.A00;
                if (view3 != null) {
                    view3.setVisibility(8);
                }
                IgdsListCell igdsListCell2 = vgS.A01;
                if (igdsListCell2 != null) {
                    igdsListCell2.setVisibility(8);
                }
            }
        }
        C0f9.A0A(1639582126, A03);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        Object obj;
        int i2;
        int A03 = C0f9.A03(509058510);
        Iterator<E> it = VDR.A01.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((VDR) obj).A00 == i) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        VDR vdr = (VDR) obj;
        if (vdr == null) {
            vdr = VDR.A03;
        }
        LayoutInflater from = LayoutInflater.from(this.A01);
        C14360o3.A0A(from);
        C14360o3.A0B(from, 0);
        int ordinal = vdr.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                i2 = R.layout.support_resource_action_row_igds;
            } else {
                throw new RuntimeException();
            }
        } else {
            i2 = R.layout.support_resource_action_row;
        }
        View A0C = AbstractC31173DnH.A0C(from, viewGroup, i2, false);
        A0C.setTag(new VgS(A0C));
        C0f9.A0A(-1583984809, A03);
        return A0C;
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return VDR.values().length;
    }
}
