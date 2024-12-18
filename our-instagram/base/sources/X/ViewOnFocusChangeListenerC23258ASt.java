package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.view.View;
import android.view.ViewStub;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.reels.interactive.view.AvatarView;
import com.instagram.user.model.User;
import java.util.ArrayList;

/* renamed from: X.ASt, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class ViewOnFocusChangeListenerC23258ASt implements View.OnFocusChangeListener, InterfaceC25184BCh, InterfaceC195198kL {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public View A05;
    public View A06;
    public View A07;
    public EditText A08;
    public TextView A09;
    public TextView A0A;
    public C57012jc A0B;
    public AvatarView A0C;
    public C221539qI A0D;
    public User A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public int[] A0J = new int[2];
    public final Context A0K;
    public final View A0L;
    public final ViewStub A0M;
    public final C88W A0N;
    public final C8O8 A0O;
    public final InterfaceC1810081c A0P;
    public final C8NX A0Q;

    @Override // X.InterfaceC195198kL
    public final void E0p(int i, int i2) {
    }

    private void A00() {
        if (this.A07 != null) {
            C150956qv.A08(new View[]{this.A0L, this.A06}, false);
            C221539qI c221539qI = this.A0D;
            c221539qI.getClass();
            c221539qI.A01("");
            EditText editText = this.A08;
            editText.getClass();
            editText.clearFocus();
        }
    }

    @Override // X.InterfaceC25184BCh
    public final void DDv(Object obj) {
        if (this.A07 == null) {
            View inflate = this.A0M.inflate();
            this.A06 = inflate;
            inflate.getClass();
            View requireViewById = inflate.requireViewById(R.id.sticker_view);
            this.A07 = requireViewById;
            C88W c88w = this.A0N;
            c88w.A03(requireViewById);
            c88w.A03.A04 = true;
            this.A0C = (AvatarView) this.A07.findViewById(R.id.fundraiser_sticker_avatar);
            View requireViewById2 = this.A07.requireViewById(R.id.fundraiser_sticker_card);
            this.A05 = requireViewById2;
            Drawable background = requireViewById2.getBackground();
            background.getClass();
            ((GradientDrawable) background.mutate()).setOrientation(GradientDrawable.Orientation.TL_BR);
            EditText editText = (EditText) this.A07.requireViewById(R.id.fundraiser_sticker_title);
            this.A08 = editText;
            editText.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
            C6QV.A00(this.A08);
            this.A08.setOnFocusChangeListener(this);
            this.A0D = new C221539qI(this.A08);
            this.A0A = AbstractC166987dD.A0e(this.A07, R.id.fundraiser_sticker_subtitle);
            this.A0B = new C57012jc((ViewStub) this.A07.findViewById(R.id.fundraiser_sticker_donate_button_divider_stub));
            this.A09 = AbstractC166987dD.A0e(this.A07, R.id.fundraiser_sticker_donate_button);
            View view = this.A06;
            view.getClass();
            ImageView imageView = (ImageView) view.requireViewById(R.id.fundraiser_sticker_color_button);
            imageView.setImageResource(R.drawable.instagram_icons_exceptions_color_picker_filled_44);
            C3P9 A0s = AbstractC166987dD.A0s(imageView);
            A0s.A02(imageView, this.A07);
            C216559iC.A02(A0s, this, 5);
        }
        View[] viewArr = {this.A0L, this.A06};
        C55942hf c55942hf = C150956qv.A02;
        AbstractC125325le.A04(null, viewArr, false);
        C88W c88w2 = this.A0N;
        c88w2.A02(c88w2.A01);
        obj.getClass();
        C189138Ze c189138Ze = ((C187968Un) obj).A00.A00;
        User user = c189138Ze.A02;
        user.getClass();
        this.A0E = user;
        String str = c189138Ze.A09;
        str.getClass();
        this.A0I = str;
        String str2 = c189138Ze.A06;
        if (str2 == null) {
            str2 = "";
        }
        this.A0H = str2;
        this.A0F = c189138Ze.A03;
        AvatarView avatarView = this.A0C;
        avatarView.getClass();
        avatarView.setAvatarUser(this.A0E);
        AvatarView avatarView2 = this.A0C;
        Context context = this.A0K;
        avatarView2.setAvatarSecondaryStrokeWidth(context.getResources().getDimensionPixelSize(R.dimen.action_sheet_divider_margin_top));
        this.A0C.setAvatarSecondaryStrokeColor(context.getColor(R.color.chat_sticker_button_divider_color));
        this.A0G = AbstractC166997dE.A0w(AbstractC167007dF.A0f(context, this.A0E.B8y(), 2131962984));
        C221539qI c221539qI = this.A0D;
        c221539qI.getClass();
        c221539qI.A00(this.A0G);
        C221539qI c221539qI2 = this.A0D;
        String str3 = c189138Ze.A0C;
        if (TextUtils.isEmpty(str3)) {
            str3 = this.A0G;
        }
        c221539qI2.A01(str3);
        EditText editText2 = this.A08;
        editText2.getClass();
        editText2.setSelection(this.A08.getText().length());
        String username = this.A0E.getUsername();
        String A0f = AbstractC167007dF.A0f(context, username, 2131963002);
        TextView textView = this.A0A;
        textView.getClass();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(A0f);
        AnonymousClass773.A03(spannableStringBuilder, new CharacterStyle(), username);
        textView.setText(spannableStringBuilder, TextView.BufferType.SPANNABLE);
        this.A0A.post(new RunnableC24361Ar4(this));
        String str4 = c189138Ze.A0A;
        int[] iArr = AlB.A02;
        EnumC209229Ne A01 = AbstractC209259Nh.A01(EnumC209229Ne.A0H, Integer.valueOf(AbstractC13950nL.A0C(str4, iArr[0])), Integer.valueOf(AbstractC13950nL.A0C(c189138Ze.A05, iArr[1])));
        A01.getClass();
        ArrayList arrayList = A4H.A01;
        int indexOf = arrayList.indexOf(A01);
        this.A00 = indexOf;
        if (indexOf == -1) {
            this.A00 = 0;
            A01 = (EnumC209229Ne) arrayList.get(0);
        }
        A01(this, A01);
        EditText editText3 = this.A08;
        editText3.getClass();
        C221539qI c221539qI3 = this.A0D;
        c221539qI3.getClass();
        editText3.addTextChangedListener(c221539qI3);
        C8O8 c8o8 = this.A0O;
        C148276lx c148276lx = C148276lx.A0a;
        c8o8.Dom("fundraiser_sticker_bundle_id");
    }

    @Override // X.InterfaceC25184BCh
    public final void DEy() {
        C8NX c8nx = this.A0Q;
        EditText editText = this.A08;
        editText.getClass();
        String trim = AbstractC167007dF.A0g(editText).trim();
        if (TextUtils.isEmpty(trim)) {
            trim = this.A0G;
        }
        int[] iArr = AlB.A03;
        C44I c44i = new C189138Ze(AJu.A00(), null, null, "", "", null, null, "", "", "", "", "", "", 0).A01;
        User user = this.A0E;
        trim.getClass();
        String A0G = AbstractC13950nL.A0G(this.A03);
        C14360o3.A0B(A0G, 0);
        String A0F = AbstractC13950nL.A0F(this.A0J[0]);
        String A0F2 = AbstractC13950nL.A0F(this.A0J[1]);
        String A0F3 = AbstractC13950nL.A0F(this.A04);
        String A0F4 = AbstractC13950nL.A0F(this.A01);
        String str = this.A0I;
        str.getClass();
        String str2 = this.A0H;
        String str3 = this.A0F;
        int i = this.A02;
        AbstractC167017dG.A0x();
        c8nx.Dog(new AlB(new C189138Ze(c44i.F55(), user, str3, A0F4, A0F2, str2, null, "", str, A0F, A0G, trim, A0F3, i)), null);
        EditText editText2 = this.A08;
        editText2.getClass();
        editText2.removeTextChangedListener(this.A0D);
        A00();
        C8O8 c8o8 = this.A0O;
        C148276lx c148276lx = C148276lx.A0a;
        c8o8.Doh("fundraiser_sticker_bundle_id");
    }

    @Override // X.InterfaceC195198kL
    public final void DOI() {
        InterfaceC1810081c.A00(this.A0P);
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        C88W c88w = this.A0N;
        if (z) {
            c88w.A00();
            C14360o3.A0B(view, 0);
            AbstractC13880nE.A0S(view);
        } else {
            c88w.A01();
            C14360o3.A0B(view, 0);
            AbstractC13880nE.A0O(view);
            A00();
        }
    }

    public ViewOnFocusChangeListenerC23258ASt(View view, C3I9 c3i9, C8O8 c8o8, InterfaceC1810081c interfaceC1810081c, C8NX c8nx) {
        Context context = view.getContext();
        this.A0K = context;
        this.A0N = new C88W(context, c3i9, this);
        this.A0Q = c8nx;
        this.A0P = interfaceC1810081c;
        this.A0L = view.requireViewById(R.id.text_overlay_edit_text_container);
        this.A0M = (ViewStub) view.requireViewById(R.id.fundraiser_sticker_editor_stub);
        this.A0O = c8o8;
    }

    public static void A01(ViewOnFocusChangeListenerC23258ASt viewOnFocusChangeListenerC23258ASt, EnumC209229Ne enumC209229Ne) {
        C57012jc c57012jc;
        int i;
        viewOnFocusChangeListenerC23258ASt.A0J = AbstractC209259Nh.A02(enumC209229Ne);
        View view = viewOnFocusChangeListenerC23258ASt.A05;
        view.getClass();
        Drawable background = view.getBackground();
        background.getClass();
        ((GradientDrawable) background.mutate()).setColors(viewOnFocusChangeListenerC23258ASt.A0J);
        if (enumC209229Ne == AlB.A01) {
            viewOnFocusChangeListenerC23258ASt.A04 = -16777216;
            viewOnFocusChangeListenerC23258ASt.A03 = -6710887;
            viewOnFocusChangeListenerC23258ASt.A01 = -13068304;
            c57012jc = viewOnFocusChangeListenerC23258ASt.A0B;
            c57012jc.getClass();
            i = 0;
        } else {
            viewOnFocusChangeListenerC23258ASt.A04 = -1;
            viewOnFocusChangeListenerC23258ASt.A03 = -855638017;
            viewOnFocusChangeListenerC23258ASt.A01 = AbstractC209259Nh.A00(enumC209229Ne);
            c57012jc = viewOnFocusChangeListenerC23258ASt.A0B;
            c57012jc.getClass();
            i = 8;
        }
        c57012jc.A03(i);
        EditText editText = viewOnFocusChangeListenerC23258ASt.A08;
        editText.getClass();
        editText.setTextColor(viewOnFocusChangeListenerC23258ASt.A04);
        TextView textView = viewOnFocusChangeListenerC23258ASt.A0A;
        textView.getClass();
        textView.setTextColor(viewOnFocusChangeListenerC23258ASt.A03);
        TextView textView2 = viewOnFocusChangeListenerC23258ASt.A09;
        textView2.getClass();
        textView2.setTextColor(viewOnFocusChangeListenerC23258ASt.A01);
    }
}
