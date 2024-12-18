package X;

import android.app.Activity;
import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView;
import com.instagram.creation.activity.MediaCaptureActivity;
import com.instagram.creation.base.VideoSession;
import com.instagram.creation.capture.video.view.IgCaptureVideoPreviewView;
import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;
import com.instagram.pendingmedia.model.ClipInfo;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/* renamed from: X.KDd, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45513KDd extends C53Z implements InterfaceC23471Cj {
    public static final InterfaceC08100bW A0B = AbstractC31175DnJ.A0B();
    public static final String __redex_internal_original_name = "VideoCropFragment";
    public View A00;
    public ColorFilterAlphaImageView A01;
    public InterfaceC50446MPa A02;
    public IgCaptureVideoPreviewView A03;
    public C195838lR A04;
    public C6WQ A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public View A09;
    public ViewGroup A0A;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "video_crop";
    }

    private void A02() {
        if (this.A08) {
            C6WQ c6wq = this.A05;
            if (c6wq != null) {
                c6wq.dismiss();
                this.A05 = null;
            }
            this.A03.A06();
            return;
        }
        C47Z A01 = A01(this);
        A01.getClass();
        ClipInfo clipInfo = A01.A1N;
        String str = clipInfo.A0F;
        str.getClass();
        this.A03.setVideoPath(AbstractC166987dD.A11(str).getAbsolutePath(), new KLA(this, clipInfo));
    }

    public static AnonymousClass841 A00(C45513KDd c45513KDd) {
        AnonymousClass841 anonymousClass841 = ((InterfaceC189608af) c45513KDd.requireContext()).Ak4().A00;
        anonymousClass841.getClass();
        return anonymousClass841;
    }

    public static C47Z A01(C45513KDd c45513KDd) {
        return C25A.A00(c45513KDd.getSession()).A03(A00(c45513KDd).E3z());
    }

    public final void A03(String str) {
        if (isResumed()) {
            if (str != null && !str.equals("video_invalid_url")) {
                C44059Jdk A00 = C44059Jdk.A00(str, 0);
                if (AbstractC23048AEe.A01(A00, new C7FH(requireContext()), true, true)) {
                    AnonymousClass841 A0Q = AbstractC43594JPz.A0Q(requireContext());
                    C47Z A01 = A01(this);
                    A01.getClass();
                    AbstractC44068Jdt.A02(getSession(), A0Q, A01, A00, A0Q.ACq(), StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS);
                    this.A06 = true;
                }
            }
            if (this.A06) {
                A02();
                return;
            }
            Activity activity = (Activity) requireContext();
            C14360o3.A0B(activity, 0);
            C9GR.A07(activity.getApplicationContext(), 2131976699);
            activity.finish();
        }
    }

    @Override // X.InterfaceC23471Cj
    public final void DYE(Map map) {
        Context requireContext = requireContext();
        if (map.get("android.permission.WRITE_EXTERNAL_STORAGE") != EnumC172127lh.A05) {
            C195838lR c195838lR = this.A04;
            if (c195838lR != null) {
                c195838lR.A06(map);
                return;
            }
            Context requireContext2 = requireContext();
            String A0K = AbstractC53242c7.A0K(requireContext2);
            ViewGroup viewGroup = this.A0A;
            viewGroup.getClass();
            C195838lR A0j = AbstractC43593JPy.A0j(viewGroup);
            A0j.A06(map);
            A0j.A05(AbstractC167007dF.A0f(requireContext2, A0K, 2131974432));
            A0j.A04(AbstractC167007dF.A0f(requireContext2, A0K, 2131974431));
            A0j.A02(2131974430);
            A0j.A03(new ViewOnClickListenerC48066LPr(39, this, requireContext));
            this.A04 = A0j;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        try {
            this.A02 = (InterfaceC50446MPa) context;
        } catch (ClassCastException unused) {
            throw new ClassCastException(AnonymousClass001.A0R(context.toString(), " must implement NavigationDelegate"));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1236109557);
        super.onCreate(bundle);
        C0f9.A09(1891887343, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(840702743);
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.fragment_crop_video);
        this.A0A = (ViewGroup) A0A.findViewById(R.id.preview_container);
        this.A03 = (IgCaptureVideoPreviewView) A0A.requireViewById(R.id.video_preview_view);
        this.A03.A01 = A00(this);
        ColorFilterAlphaImageView colorFilterAlphaImageView = (ColorFilterAlphaImageView) A0A.requireViewById(R.id.croptype_toggle_button);
        this.A01 = colorFilterAlphaImageView;
        ViewOnClickListenerC48063LPo.A00(colorFilterAlphaImageView, 33, this);
        View requireViewById = A0A.requireViewById(R.id.button_back);
        this.A09 = requireViewById;
        ViewOnClickListenerC48063LPo.A00(requireViewById, 34, this);
        this.A09.setBackground(new C3DW(requireActivity().getTheme(), C05F.A00));
        this.A00 = A0A.findViewById(R.id.button_next);
        C0f9.A09(108601844, A02);
        return A0A;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(1053795695);
        super.onDestroyView();
        C6WQ c6wq = this.A05;
        if (c6wq != null) {
            c6wq.dismiss();
            this.A05 = null;
        }
        this.A09.setOnClickListener(null);
        this.A09 = null;
        View view = this.A00;
        if (view != null) {
            view.setOnClickListener(null);
            this.A00 = null;
        }
        this.A06 = false;
        this.A08 = false;
        this.A03 = null;
        this.A0A = null;
        this.A01 = null;
        C195838lR c195838lR = this.A04;
        if (c195838lR != null) {
            c195838lR.A00();
            this.A04 = null;
        }
        C0f9.A09(-1606446828, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        int A02 = C0f9.A02(-632408795);
        super.onDetach();
        this.A02 = null;
        C0f9.A09(24269809, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(1496241522);
        super.onPause();
        if (this.A08) {
            this.A03.A04();
        }
        C0f9.A09(-367024741, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        ContentProviderClient A00;
        Cursor query;
        String string;
        List list;
        int A02 = C0f9.A02(-284310742);
        super.onResume();
        if (Build.VERSION.SDK_INT < 33 && !AbstractC23451Ch.A07(requireContext(), "android.permission.WRITE_EXTERNAL_STORAGE")) {
            AbstractC43592JPx.A1C((Activity) requireContext(), this, "android.permission.WRITE_EXTERNAL_STORAGE");
        } else {
            C195838lR c195838lR = this.A04;
            if (c195838lR != null) {
                c195838lR.A00();
                this.A04 = null;
            }
            C6WQ c6wq = new C6WQ(requireContext());
            this.A05 = c6wq;
            c6wq.A00(getString(2131965660));
            C0fJ.A00(this.A05);
            if (!this.A06) {
                VideoSession A04 = ((MX5) A00(this)).A01.A04();
                A04.getClass();
                String str = A04.A0H;
                C14360o3.A07(str);
                android.net.Uri A01 = AbstractC08820cl.A01(A0B, str);
                if (A01 != null) {
                    Context requireContext = requireContext();
                    if (DocumentsContract.isDocumentUri(requireContext, A01) && "com.android.providers.media.documents".equals(A01.getAuthority())) {
                        android.net.Uri uri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                        C14360o3.A08(uri);
                        A00 = AbstractC15910ql.A00(requireContext, uri);
                        if (A00 != null) {
                            try {
                                String documentId = DocumentsContract.getDocumentId(A01);
                                if (documentId != null) {
                                    List A03 = new C11L(":").A03(documentId);
                                    if (!A03.isEmpty()) {
                                        ListIterator A14 = AbstractC43592JPx.A14(A03);
                                        while (A14.hasPrevious()) {
                                            if (((String) A14.previous()).length() != 0) {
                                                list = AbstractC001800i.A0d(A03, A14.nextIndex() + 1);
                                                break;
                                            }
                                        }
                                    }
                                    list = C16930sl.A00;
                                    query = A00.query(uri, new String[]{"_data"}, "_id=?", new String[]{AbstractC31173DnH.A1b(list, 0)[1]}, null);
                                } else {
                                    throw AbstractC166997dE.A0g();
                                }
                            } catch (RemoteException unused) {
                            }
                        }
                        A03(A01.getPath());
                    } else {
                        try {
                            A00 = AbstractC15910ql.A00(requireContext, A01);
                            if (A00 == null) {
                                AbstractC44068Jdt.A01(requireContext, A01, AbstractC25225BEi.A16(this));
                            } else {
                                query = A00.query(A01, new String[]{"_data"}, null, null, null);
                            }
                        } catch (SQLiteException | RemoteException | IllegalArgumentException unused2) {
                            AbstractC44068Jdt.A01(requireContext, A01, AbstractC25225BEi.A16(this));
                        }
                    }
                    if (query != null) {
                        try {
                            query.moveToFirst();
                            int columnIndex = query.getColumnIndex("_data");
                            if (columnIndex >= 0 && (string = query.getString(columnIndex)) != null) {
                                A03(string);
                            } else {
                                AbstractC44068Jdt.A01(requireContext, A01, AbstractC25225BEi.A16(this));
                            }
                        } finally {
                            A00.release();
                            query.close();
                        }
                    }
                    A03(A01.getPath());
                }
            } else {
                A02();
            }
        }
        C6WI.A01().A0L = true;
        C0f9.A09(610075994, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (A01(this) == null) {
            InterfaceC50446MPa interfaceC50446MPa = this.A02;
            interfaceC50446MPa.getClass();
            ((MediaCaptureActivity) interfaceC50446MPa).onBackPressed();
        }
    }
}
